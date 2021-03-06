/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v2.client.api;

import com.datadog.api.v2.client.*;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.model.APIErrorResponse;
import com.datadog.api.v2.client.model.IncidentServiceCreateRequest;
import com.datadog.api.v2.client.model.IncidentServiceResponse;
import com.datadog.api.v2.client.model.IncidentServiceUpdateRequest;
import com.datadog.api.v2.client.model.IncidentServicesResponse;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IncidentServicesApi
 */
public class IncidentServicesApiTest {

    private final IncidentServicesApi api = new IncidentServicesApi();

    /**
     * Create a new incident service
     *
     * Creates a new incident service.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createIncidentServiceTest() throws ApiException {
        //IncidentServiceCreateRequest body = null;
        //IncidentServiceResponse response = api.createIncidentService()
        //        .body(body)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Delete an existing incident service
     *
     * Deletes an existing incident service.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteIncidentServiceTest() throws ApiException {
        //String serviceId = null;
        //api.deleteIncidentService(serviceId)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Get details of an incident service
     *
     * Get details of an incident service. If the &#x60;include[users]&#x60; query parameter is provided, the included attribute will contain the users related to these incident services.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIncidentServiceTest() throws ApiException {
        //String serviceId = null;
        //String include = null;
        //IncidentServiceResponse response = api.getIncidentService(serviceId)
        //        .include(include)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Get a list of all incident services
     *
     * Get all incident services uploaded for the requesting user&#39;s organization. If the &#x60;include[users]&#x60; query parameter is provided, the included attribute will contain the users related to these incident services.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIncidentServicesTest() throws ApiException {
        //String include = null;
        //Long pageSize = null;
        //Long pageOffset = null;
        //IncidentServicesResponse response = api.getIncidentServices()
        //        .include(include)
        //        .pageSize(pageSize)
        //        .pageOffset(pageOffset)
        //        .execute();
        // TODO: test validations
    }

    /**
     * Update an existing incident service
     *
     * Updates an existing incident service. Only provide the attributes which should be updated as this request is a partial update.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateIncidentServiceTest() throws ApiException {
        //String serviceId = null;
        //IncidentServiceUpdateRequest body = null;
        //IncidentServiceResponse response = api.updateIncidentService(serviceId)
        //        .body(body)
        //        .execute();
        // TODO: test validations
    }

}
