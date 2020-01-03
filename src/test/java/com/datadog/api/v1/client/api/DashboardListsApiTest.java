/*
 * (C) Datadog, Inc. 2019
 * All rights reserved
 * Licensed under a 3-clause BSD style license (see LICENSE)
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.DashboardList;
import com.datadog.api.v1.client.model.DashboardListDeleteResponse;
import static org.junit.Assert.*;

import org.junit.*;
import org.threeten.bp.OffsetDateTime;

import java.util.ArrayList;

/**
 * API tests for DashboardListsApi
 */
@Ignore
public class DashboardListsApiTest extends V1ApiTest {

    private static DashboardListsApi api;
    private ArrayList<Long> dashboardListsToDelete;

    @Before
    public void resetDashboardListsToDelete() {
        dashboardListsToDelete = new ArrayList<Long>();
    }

    @BeforeClass
    public static void initApi() {
        api = new DashboardListsApi(generalApiClient);
    }

    @Test
    public void dashboardListCreateModifyDeleteTest() throws ApiException {

        long start = System.currentTimeMillis();
        DashboardList testDashboardList = new DashboardList().name(String.format("java dashboard list %d", start));

        // Create dashboard list
        DashboardList dashboardList = api.createDashboardList(testDashboardList).execute();
        dashboardListsToDelete.add(dashboardList.getId());
        assertEquals(testDashboardList.getName(), dashboardList.getName());
        assertNotNull(dashboardList.getAuthor());
        assertNotNull(dashboardList.getCreated());
        assertEquals(new Integer(0), dashboardList.getDashboardCount());
        assertNotNull(dashboardList.getModified());
        assertFalse(dashboardList.getIsFavorite());
        assertEquals("manual_dashboard_list", dashboardList.getType());

        // Get the dashboard list
        dashboardList = api.getDashboardList(dashboardList.getId()).execute();
        assertEquals(dashboardList.getName(), testDashboardList.getName());

        // Edit the dashboard list
        DashboardList editedDashboardList = new DashboardList().name(String.format("java updated dashboard list %d", start));
        dashboardList = api.updateDashboardList(dashboardList.getId(), editedDashboardList).execute();
        assertEquals(dashboardList.getName(), editedDashboardList.getName());

        // Delete the dashboard list
        DashboardListDeleteResponse res = api.deleteDashboardList(dashboardList.getId()).execute();
        assertEquals(res.getDeletedDashboardListId(), dashboardList.getId());
    }

    @After
    public void deleteDashboardLists() throws ApiException {
        if (dashboardListsToDelete != null) {
            for (Long id : dashboardListsToDelete) {
                try {
                    api.getDashboardList(id).execute();
                } catch (ApiException e) {
                    // doesn't exist => continue
                    continue;
                }
                api.deleteDashboardList(id).execute();
            }
        }
    }
}