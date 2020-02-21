/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.TestUtils;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.model.EventPriority;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * API tests for EventsApi
 */
public class EventsApiTest extends V1ApiTest {

    private static EventsApi api;

    @BeforeClass
    public static void initApi() {
        api = new EventsApi(generalApiClient);
    }

    /**
     * Test event lifecycle.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void eventLifecycleTest() throws ApiException, TestUtils.RetryException {
        final Event event = new Event().title("test event from java client").text("example text")
                .tags(new ArrayList<String>(Arrays.asList("test", "client:java"))).priority(EventPriority.NORMAL)
                .sourceTypeName("datadog-api-client-java");

        EventResponse response = api.createEvent().body(event).execute();

        final Event createdEvent = response.getEvent();
        final String status = response.getStatus();
        assertEquals("ok", status);
        assertEquals(event.getTitle(), createdEvent.getTitle());
        assertEquals(event.getText(), createdEvent.getText());
        assertNotEquals("", createdEvent.getUrl());

        final Long eventId = createdEvent.getId();

        AtomicReference<EventResponse> eventGetResponse = new AtomicReference<>();
        // Confirm the event is retrievable from the API
        // Will fail with a retryException if we can't get the event in this timeframe
        TestUtils.retry(10, 20, () -> {
            try {
                eventGetResponse.set(api.getEvent(eventId).execute());
            } catch(ApiException e) {
                System.out.println(String.format("Error getting event: %s", e));
                return false;
            }
            return true;
        });

        final Event fetchedEvent = eventGetResponse.get().getEvent();
        assertEquals(event.getTitle(), fetchedEvent.getTitle());
        assertEquals(event.getText(), fetchedEvent.getText());
        assertNotEquals("", fetchedEvent.getUrl());

        final Long start = fetchedEvent.getDateHappened() - 10;
        final Long end = start + 20;
        final EventPriority priority = fetchedEvent.getPriority();
        final String sources = fetchedEvent.getSourceTypeName();
        final String tags = String.join(",", fetchedEvent.getTags());
        final Boolean unaggregated = true;

        // Confirm the event is in the list of events returned from the API
        // Will fail with a retryException if we can't get the event in this timeframe
        TestUtils.retry(10, 20, () -> {
            List<Event> events;
            try {
                EventListResponse eventListResponse = api.listEvents().start(start).end(end).priority(priority)
                        .sources(sources).tags(tags).unaggregated(unaggregated).execute();
                events = eventListResponse.getEvents();
                if (!events.isEmpty() && events.contains(fetchedEvent)) {
                    return true;
                } else {
                    System.out.printf("Error: Event %s not in event list: %s", fetchedEvent, eventListResponse);
                    return false;
                }
            } catch(ApiException e) {
                System.out.println(String.format("Error getting list of events: %s", e));
                return false;
            }
        });
    }
}
