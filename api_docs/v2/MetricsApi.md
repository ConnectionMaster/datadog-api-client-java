# MetricsApi

All URIs are relative to *https://api.datadoghq.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTagConfiguration**](MetricsApi.md#createTagConfiguration) | **POST** /api/v2/metrics/{metric_name}/tags | Create a Tag Configuration
[**deleteTagConfiguration**](MetricsApi.md#deleteTagConfiguration) | **DELETE** /api/v2/metrics/{metric_name}/tags | Delete a Tag Configuration
[**listTagConfigurationByName**](MetricsApi.md#listTagConfigurationByName) | **GET** /api/v2/metrics/{metric_name}/tags | List Tag Configuration by Name
[**listTagConfigurations**](MetricsApi.md#listTagConfigurations) | **GET** /api/v2/metrics | List Tag Configurations
[**updateTagConfiguration**](MetricsApi.md#updateTagConfiguration) | **PATCH** /api/v2/metrics/{metric_name}/tags | Update a Tag Configuration



## createTagConfiguration

> MetricTagConfigurationResponse createTagConfiguration(metricName).body(body).execute();

Create a Tag Configuration

Create and define a list of queryable tag keys for a count/gauge/rate/distribution metric.
Can only be used with application keys of users with the `Manage Tags for Metrics` permission.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure the Datadog site to send API calls to
        HashMap<String, String> serverVariables = new HashMap<String, String>();
        String site = System.getenv("DD_SITE");
        if (site != null) {
            serverVariables.put("site", site);
            defaultClient.setServerVariables(serverVariables);
        }
        // Configure API key authorization: 
        HashMap<String, String> secrets = new HashMap<String, String>();
        secrets.put("apiKeyAuth", System.getenv("DD_CLIENT_API_KEY"));
        secrets.put("appKeyAuth", System.getenv("DD_CLIENT_APP_KEY"));
        defaultClient.configureApiKeys(secrets);

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String metricName = "dist.http.endpoint.request"; // String | The name of the metric.
        MetricTagConfigurationCreateRequest body = new MetricTagConfigurationCreateRequest(); // MetricTagConfigurationCreateRequest | 
        try {
            MetricTagConfigurationResponse result = apiInstance.createTagConfiguration(metricName)
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#createTagConfiguration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metricName** | **String**| The name of the metric. |
 **body** | [**MetricTagConfigurationCreateRequest**](MetricTagConfigurationCreateRequest.md)|  |

### Return type

[**MetricTagConfigurationResponse**](MetricTagConfigurationResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |
| **429** | Too Many Requests |  -  |


## deleteTagConfiguration

> deleteTagConfiguration(metricName).execute();

Delete a Tag Configuration

Deletes a metric's tag configuration. Can only be used with application
keys from users with the `Manage Tags for Metrics` permission.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure the Datadog site to send API calls to
        HashMap<String, String> serverVariables = new HashMap<String, String>();
        String site = System.getenv("DD_SITE");
        if (site != null) {
            serverVariables.put("site", site);
            defaultClient.setServerVariables(serverVariables);
        }
        // Configure API key authorization: 
        HashMap<String, String> secrets = new HashMap<String, String>();
        secrets.put("apiKeyAuth", System.getenv("DD_CLIENT_API_KEY"));
        secrets.put("appKeyAuth", System.getenv("DD_CLIENT_APP_KEY"));
        defaultClient.configureApiKeys(secrets);

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String metricName = "dist.http.endpoint.request"; // String | The name of the metric.
        try {
            apiInstance.deleteTagConfiguration(metricName)
                .execute();
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#deleteTagConfiguration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metricName** | **String**| The name of the metric. |

### Return type

null (empty response body)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **403** | Forbidden |  -  |
| **404** | Not found |  -  |
| **429** | Too Many Requests |  -  |


## listTagConfigurationByName

> MetricTagConfigurationResponse listTagConfigurationByName(metricName).execute();

List Tag Configuration by Name

Returns the tag configuration for the given metric name.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure the Datadog site to send API calls to
        HashMap<String, String> serverVariables = new HashMap<String, String>();
        String site = System.getenv("DD_SITE");
        if (site != null) {
            serverVariables.put("site", site);
            defaultClient.setServerVariables(serverVariables);
        }
        // Configure API key authorization: 
        HashMap<String, String> secrets = new HashMap<String, String>();
        secrets.put("apiKeyAuth", System.getenv("DD_CLIENT_API_KEY"));
        secrets.put("appKeyAuth", System.getenv("DD_CLIENT_APP_KEY"));
        defaultClient.configureApiKeys(secrets);

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String metricName = "dist.http.endpoint.request"; // String | The name of the metric.
        try {
            MetricTagConfigurationResponse result = apiInstance.listTagConfigurationByName(metricName)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#listTagConfigurationByName");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metricName** | **String**| The name of the metric. |

### Return type

[**MetricTagConfigurationResponse**](MetricTagConfigurationResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |


## listTagConfigurations

> MetricsAndMetricTagConfigurationsResponse listTagConfigurations().filterConfigured(filterConfigured).filterTagsConfigured(filterTagsConfigured).filterMetricType(filterMetricType).filterIncludePercentiles(filterIncludePercentiles).execute();

List Tag Configurations

Returns all configured count/gauge/rate/distribution metric names
(with additional filters if specified).

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure the Datadog site to send API calls to
        HashMap<String, String> serverVariables = new HashMap<String, String>();
        String site = System.getenv("DD_SITE");
        if (site != null) {
            serverVariables.put("site", site);
            defaultClient.setServerVariables(serverVariables);
        }
        // Configure API key authorization: 
        HashMap<String, String> secrets = new HashMap<String, String>();
        secrets.put("apiKeyAuth", System.getenv("DD_CLIENT_API_KEY"));
        secrets.put("appKeyAuth", System.getenv("DD_CLIENT_APP_KEY"));
        defaultClient.configureApiKeys(secrets);

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        Boolean filterConfigured = true; // Boolean | Filter metrics that have configured tags.
        String filterTagsConfigured = "app"; // String | Filter tag configurations by configured tags.
        MetricTagConfigurationMetricTypes filterMetricType = MetricTagConfigurationMetricTypes.fromValue("gauge"); // MetricTagConfigurationMetricTypes | Filter tag configurations by metric type.
        Boolean filterIncludePercentiles = true; // Boolean | Filter distributions with additional percentile aggregations enabled or disabled.
        try {
            MetricsAndMetricTagConfigurationsResponse result = apiInstance.listTagConfigurations()
                .filterConfigured(filterConfigured)
                .filterTagsConfigured(filterTagsConfigured)
                .filterMetricType(filterMetricType)
                .filterIncludePercentiles(filterIncludePercentiles)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#listTagConfigurations");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filterConfigured** | **Boolean**| Filter metrics that have configured tags. | [optional]
 **filterTagsConfigured** | **String**| Filter tag configurations by configured tags. | [optional]
 **filterMetricType** | **MetricTagConfigurationMetricTypes**| Filter tag configurations by metric type. | [optional] [default to gauge] [enum: gauge, count, distribution]
 **filterIncludePercentiles** | **Boolean**| Filter distributions with additional percentile aggregations enabled or disabled. | [optional]

### Return type

[**MetricsAndMetricTagConfigurationsResponse**](MetricsAndMetricTagConfigurationsResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **429** | Too Many Requests |  -  |


## updateTagConfiguration

> MetricTagConfigurationResponse updateTagConfiguration(metricName).body(body).execute();

Update a Tag Configuration

Update the tag configuration of a metric. Can only be used with
application keys from users with the `Manage Tags for Metrics` permission.

### Example

```java
// Import classes:
import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.auth.*;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        // Configure the Datadog site to send API calls to
        HashMap<String, String> serverVariables = new HashMap<String, String>();
        String site = System.getenv("DD_SITE");
        if (site != null) {
            serverVariables.put("site", site);
            defaultClient.setServerVariables(serverVariables);
        }
        // Configure API key authorization: 
        HashMap<String, String> secrets = new HashMap<String, String>();
        secrets.put("apiKeyAuth", System.getenv("DD_CLIENT_API_KEY"));
        secrets.put("appKeyAuth", System.getenv("DD_CLIENT_APP_KEY"));
        defaultClient.configureApiKeys(secrets);

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String metricName = "dist.http.endpoint.request"; // String | The name of the metric.
        MetricTagConfigurationUpdateRequest body = new MetricTagConfigurationUpdateRequest(); // MetricTagConfigurationUpdateRequest | 
        try {
            MetricTagConfigurationResponse result = apiInstance.updateTagConfiguration(metricName)
                .body(body)
                .execute();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#updateTagConfiguration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **metricName** | **String**| The name of the metric. |
 **body** | [**MetricTagConfigurationUpdateRequest**](MetricTagConfigurationUpdateRequest.md)|  |

### Return type

[**MetricTagConfigurationResponse**](MetricTagConfigurationResponse.md)

### Authorization

[apiKeyAuth](README.md#apiKeyAuth), [appKeyAuth](README.md#appKeyAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **422** | Unprocessable Entity |  -  |
| **429** | Too Many Requests |  -  |
