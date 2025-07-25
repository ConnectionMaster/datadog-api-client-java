package com.datadog.api.client.v2.api;

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiResponse;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.Pair;
import com.datadog.api.client.v2.model.Case;
import com.datadog.api.client.v2.model.CaseAssignRequest;
import com.datadog.api.client.v2.model.CaseCreateRequest;
import com.datadog.api.client.v2.model.CaseEmptyRequest;
import com.datadog.api.client.v2.model.CaseResponse;
import com.datadog.api.client.v2.model.CaseSortableField;
import com.datadog.api.client.v2.model.CaseUpdatePriorityRequest;
import com.datadog.api.client.v2.model.CaseUpdateStatusRequest;
import com.datadog.api.client.v2.model.CasesResponse;
import com.datadog.api.client.v2.model.ProjectCreateRequest;
import com.datadog.api.client.v2.model.ProjectResponse;
import com.datadog.api.client.v2.model.ProjectsResponse;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.core.GenericType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CaseManagementApi {
  private ApiClient apiClient;

  public CaseManagementApi() {
    this(ApiClient.getDefaultApiClient());
  }

  public CaseManagementApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client.
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client.
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Archive case.
   *
   * <p>See {@link #archiveCaseWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Archive case payload (required)
   * @return CaseResponse
   * @throws ApiException if fails to make API call
   */
  public CaseResponse archiveCase(String caseId, CaseEmptyRequest body) throws ApiException {
    return archiveCaseWithHttpInfo(caseId, body).getData();
  }

  /**
   * Archive case.
   *
   * <p>See {@link #archiveCaseWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Archive case payload (required)
   * @return CompletableFuture&lt;CaseResponse&gt;
   */
  public CompletableFuture<CaseResponse> archiveCaseAsync(String caseId, CaseEmptyRequest body) {
    return archiveCaseWithHttpInfoAsync(caseId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Archive case
   *
   * @param caseId Case's UUID or key (required)
   * @param body Archive case payload (required)
   * @return ApiResponse&lt;CaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseResponse> archiveCaseWithHttpInfo(String caseId, CaseEmptyRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling archiveCase");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling archiveCase");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/archive"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.archiveCase",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Archive case.
   *
   * <p>See {@link #archiveCaseWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Archive case payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseResponse>> archiveCaseWithHttpInfoAsync(
      String caseId, CaseEmptyRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseId' when calling archiveCase"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling archiveCase"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/archive"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.archiveCase",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Assign case.
   *
   * <p>See {@link #assignCaseWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Assign case payload (required)
   * @return CaseResponse
   * @throws ApiException if fails to make API call
   */
  public CaseResponse assignCase(String caseId, CaseAssignRequest body) throws ApiException {
    return assignCaseWithHttpInfo(caseId, body).getData();
  }

  /**
   * Assign case.
   *
   * <p>See {@link #assignCaseWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Assign case payload (required)
   * @return CompletableFuture&lt;CaseResponse&gt;
   */
  public CompletableFuture<CaseResponse> assignCaseAsync(String caseId, CaseAssignRequest body) {
    return assignCaseWithHttpInfoAsync(caseId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Assign case to a user
   *
   * @param caseId Case's UUID or key (required)
   * @param body Assign case payload (required)
   * @return ApiResponse&lt;CaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseResponse> assignCaseWithHttpInfo(String caseId, CaseAssignRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling assignCase");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling assignCase");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/assign"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.assignCase",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Assign case.
   *
   * <p>See {@link #assignCaseWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Assign case payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseResponse>> assignCaseWithHttpInfoAsync(
      String caseId, CaseAssignRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'caseId' when calling assignCase"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling assignCase"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/assign"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.assignCase",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Create a case.
   *
   * <p>See {@link #createCaseWithHttpInfo}.
   *
   * @param body Case payload (required)
   * @return CaseResponse
   * @throws ApiException if fails to make API call
   */
  public CaseResponse createCase(CaseCreateRequest body) throws ApiException {
    return createCaseWithHttpInfo(body).getData();
  }

  /**
   * Create a case.
   *
   * <p>See {@link #createCaseWithHttpInfoAsync}.
   *
   * @param body Case payload (required)
   * @return CompletableFuture&lt;CaseResponse&gt;
   */
  public CompletableFuture<CaseResponse> createCaseAsync(CaseCreateRequest body) {
    return createCaseWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a Case
   *
   * @param body Case payload (required)
   * @return ApiResponse&lt;CaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseResponse> createCaseWithHttpInfo(CaseCreateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createCase");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cases";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.createCase",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Create a case.
   *
   * <p>See {@link #createCaseWithHttpInfo}.
   *
   * @param body Case payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseResponse>> createCaseWithHttpInfoAsync(
      CaseCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling createCase"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cases";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.createCase",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Create a project.
   *
   * <p>See {@link #createProjectWithHttpInfo}.
   *
   * @param body Project payload (required)
   * @return ProjectResponse
   * @throws ApiException if fails to make API call
   */
  public ProjectResponse createProject(ProjectCreateRequest body) throws ApiException {
    return createProjectWithHttpInfo(body).getData();
  }

  /**
   * Create a project.
   *
   * <p>See {@link #createProjectWithHttpInfoAsync}.
   *
   * @param body Project payload (required)
   * @return CompletableFuture&lt;ProjectResponse&gt;
   */
  public CompletableFuture<ProjectResponse> createProjectAsync(ProjectCreateRequest body) {
    return createProjectWithHttpInfoAsync(body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Create a project.
   *
   * @param body Project payload (required)
   * @return ApiResponse&lt;ProjectResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 201 </td><td> CREATED </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ProjectResponse> createProjectWithHttpInfo(ProjectCreateRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling createProject");
    }
    // create path and map variables
    String localVarPath = "/api/v2/cases/projects";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.createProject",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ProjectResponse>() {});
  }

  /**
   * Create a project.
   *
   * <p>See {@link #createProjectWithHttpInfo}.
   *
   * @param body Project payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ProjectResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProjectResponse>> createProjectWithHttpInfoAsync(
      ProjectCreateRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<ProjectResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling createProject"));
      return result;
    }
    // create path and map variables
    String localVarPath = "/api/v2/cases/projects";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.createProject",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProjectResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ProjectResponse>() {});
  }

  /**
   * Remove a project.
   *
   * <p>See {@link #deleteProjectWithHttpInfo}.
   *
   * @param projectId Project UUID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteProject(String projectId) throws ApiException {
    deleteProjectWithHttpInfo(projectId);
  }

  /**
   * Remove a project.
   *
   * <p>See {@link #deleteProjectWithHttpInfoAsync}.
   *
   * @param projectId Project UUID (required)
   * @return CompletableFuture
   */
  public CompletableFuture<Void> deleteProjectAsync(String projectId) {
    return deleteProjectWithHttpInfoAsync(projectId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Remove a project using the project's <code>id</code>.
   *
   * @param projectId Project UUID (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> API error response </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<Void> deleteProjectWithHttpInfo(String projectId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling deleteProject");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.deleteProject",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"*/*"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Remove a project.
   *
   * <p>See {@link #deleteProjectWithHttpInfo}.
   *
   * @param projectId Project UUID (required)
   * @return CompletableFuture&lt;ApiResponse&lt;Void&gt;&gt;
   */
  public CompletableFuture<ApiResponse<Void>> deleteProjectWithHttpInfoAsync(String projectId) {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'projectId' when calling deleteProject"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.deleteProject",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"*/*"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<Void>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "DELETE",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        null);
  }

  /**
   * Get the details of a case.
   *
   * <p>See {@link #getCaseWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @return CaseResponse
   * @throws ApiException if fails to make API call
   */
  public CaseResponse getCase(String caseId) throws ApiException {
    return getCaseWithHttpInfo(caseId).getData();
  }

  /**
   * Get the details of a case.
   *
   * <p>See {@link #getCaseWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @return CompletableFuture&lt;CaseResponse&gt;
   */
  public CompletableFuture<CaseResponse> getCaseAsync(String caseId) {
    return getCaseWithHttpInfoAsync(caseId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the details of case by <code>case_id</code>
   *
   * @param caseId Case's UUID or key (required)
   * @return ApiResponse&lt;CaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseResponse> getCaseWithHttpInfo(String caseId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(400, "Missing the required parameter 'caseId' when calling getCase");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.getCase",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Get the details of a case.
   *
   * <p>See {@link #getCaseWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseResponse>> getCaseWithHttpInfoAsync(String caseId) {
    Object localVarPostBody = null;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'caseId' when calling getCase"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.getCase",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Get the details of a project.
   *
   * <p>See {@link #getProjectWithHttpInfo}.
   *
   * @param projectId Project UUID (required)
   * @return ProjectResponse
   * @throws ApiException if fails to make API call
   */
  public ProjectResponse getProject(String projectId) throws ApiException {
    return getProjectWithHttpInfo(projectId).getData();
  }

  /**
   * Get the details of a project.
   *
   * <p>See {@link #getProjectWithHttpInfoAsync}.
   *
   * @param projectId Project UUID (required)
   * @return CompletableFuture&lt;ProjectResponse&gt;
   */
  public CompletableFuture<ProjectResponse> getProjectAsync(String projectId) {
    return getProjectWithHttpInfoAsync(projectId)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get the details of a project by <code>project_id</code>.
   *
   * @param projectId Project UUID (required)
   * @return ApiResponse&lt;ProjectResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ProjectResponse> getProjectWithHttpInfo(String projectId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'projectId' when calling getProject");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.getProject",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ProjectResponse>() {});
  }

  /**
   * Get the details of a project.
   *
   * <p>See {@link #getProjectWithHttpInfo}.
   *
   * @param projectId Project UUID (required)
   * @return CompletableFuture&lt;ApiResponse&lt;ProjectResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProjectResponse>> getProjectWithHttpInfoAsync(
      String projectId) {
    Object localVarPostBody = null;

    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      CompletableFuture<ApiResponse<ProjectResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'projectId' when calling getProject"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/projects/{project_id}"
            .replaceAll("\\{" + "project_id" + "\\}", apiClient.escapeString(projectId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.getProject",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProjectResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ProjectResponse>() {});
  }

  /**
   * Get all projects.
   *
   * <p>See {@link #getProjectsWithHttpInfo}.
   *
   * @return ProjectsResponse
   * @throws ApiException if fails to make API call
   */
  public ProjectsResponse getProjects() throws ApiException {
    return getProjectsWithHttpInfo().getData();
  }

  /**
   * Get all projects.
   *
   * <p>See {@link #getProjectsWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;ProjectsResponse&gt;
   */
  public CompletableFuture<ProjectsResponse> getProjectsAsync() {
    return getProjectsWithHttpInfoAsync()
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Get all projects.
   *
   * @return ApiResponse&lt;ProjectsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<ProjectsResponse> getProjectsWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cases/projects";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.getProjects",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ProjectsResponse>() {});
  }

  /**
   * Get all projects.
   *
   * <p>See {@link #getProjectsWithHttpInfo}.
   *
   * @return CompletableFuture&lt;ApiResponse&lt;ProjectsResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<ProjectsResponse>> getProjectsWithHttpInfoAsync() {
    Object localVarPostBody = null;
    // create path and map variables
    String localVarPath = "/api/v2/cases/projects";

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.getProjects",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<ProjectsResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<ProjectsResponse>() {});
  }

  /** Manage optional parameters to searchCases. */
  public static class SearchCasesOptionalParameters {
    private Long pageSize;
    private Long pageNumber;
    private CaseSortableField sortField;
    private String filter;
    private Boolean sortAsc;

    /**
     * Set pageSize.
     *
     * @param pageSize Size for a given page. The maximum allowed value is 100. (optional, default
     *     to 10)
     * @return SearchCasesOptionalParameters
     */
    public SearchCasesOptionalParameters pageSize(Long pageSize) {
      this.pageSize = pageSize;
      return this;
    }

    /**
     * Set pageNumber.
     *
     * @param pageNumber Specific page number to return. (optional, default to 0)
     * @return SearchCasesOptionalParameters
     */
    public SearchCasesOptionalParameters pageNumber(Long pageNumber) {
      this.pageNumber = pageNumber;
      return this;
    }

    /**
     * Set sortField.
     *
     * @param sortField Specify which field to sort (optional)
     * @return SearchCasesOptionalParameters
     */
    public SearchCasesOptionalParameters sortField(CaseSortableField sortField) {
      this.sortField = sortField;
      return this;
    }

    /**
     * Set filter.
     *
     * @param filter Search query (optional)
     * @return SearchCasesOptionalParameters
     */
    public SearchCasesOptionalParameters filter(String filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set sortAsc.
     *
     * @param sortAsc Specify if order is ascending or not (optional, default to false)
     * @return SearchCasesOptionalParameters
     */
    public SearchCasesOptionalParameters sortAsc(Boolean sortAsc) {
      this.sortAsc = sortAsc;
      return this;
    }
  }

  /**
   * Search cases.
   *
   * <p>See {@link #searchCasesWithHttpInfo}.
   *
   * @return CasesResponse
   * @throws ApiException if fails to make API call
   */
  public CasesResponse searchCases() throws ApiException {
    return searchCasesWithHttpInfo(new SearchCasesOptionalParameters()).getData();
  }

  /**
   * Search cases.
   *
   * <p>See {@link #searchCasesWithHttpInfoAsync}.
   *
   * @return CompletableFuture&lt;CasesResponse&gt;
   */
  public CompletableFuture<CasesResponse> searchCasesAsync() {
    return searchCasesWithHttpInfoAsync(new SearchCasesOptionalParameters())
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search cases.
   *
   * <p>See {@link #searchCasesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CasesResponse
   * @throws ApiException if fails to make API call
   */
  public CasesResponse searchCases(SearchCasesOptionalParameters parameters) throws ApiException {
    return searchCasesWithHttpInfo(parameters).getData();
  }

  /**
   * Search cases.
   *
   * <p>See {@link #searchCasesWithHttpInfoAsync}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;CasesResponse&gt;
   */
  public CompletableFuture<CasesResponse> searchCasesAsync(
      SearchCasesOptionalParameters parameters) {
    return searchCasesWithHttpInfoAsync(parameters)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Search cases.
   *
   * <p>See {@link #searchCasesWithHttpInfo}.
   *
   * @return PaginationIterable&lt;Case&gt;
   */
  public PaginationIterable<Case> searchCasesWithPagination() {
    SearchCasesOptionalParameters parameters = new SearchCasesOptionalParameters();
    return searchCasesWithPagination(parameters);
  }

  /**
   * Search cases.
   *
   * <p>See {@link #searchCasesWithHttpInfo}.
   *
   * @return CasesResponse
   */
  public PaginationIterable<Case> searchCasesWithPagination(
      SearchCasesOptionalParameters parameters) {
    String resultsPath = "getData";
    String valueGetterPath = "";
    String valueSetterPath = "pageNumber";
    Boolean valueSetterParamOptional = true;
    parameters.pageNumber(0l);
    Long limit;

    if (parameters.pageSize == null) {
      limit = 10l;
      parameters.pageSize(limit);
    } else {
      limit = parameters.pageSize;
    }

    LinkedHashMap<String, Object> args = new LinkedHashMap<String, Object>();
    args.put("optionalParams", parameters);

    PaginationIterable iterator =
        new PaginationIterable(
            this,
            "searchCases",
            resultsPath,
            valueGetterPath,
            valueSetterPath,
            valueSetterParamOptional,
            false,
            limit,
            args);

    return iterator;
  }

  /**
   * Search cases.
   *
   * @param parameters Optional parameters for the request.
   * @return ApiResponse&lt;CasesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CasesResponse> searchCasesWithHttpInfo(
      SearchCasesOptionalParameters parameters) throws ApiException {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    CaseSortableField sortField = parameters.sortField;
    String filter = parameters.filter;
    Boolean sortAsc = parameters.sortAsc;
    // create path and map variables
    String localVarPath = "/api/v2/cases";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[field]", sortField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[asc]", sortAsc));

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.searchCases",
            localVarPath,
            localVarQueryParams,
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CasesResponse>() {});
  }

  /**
   * Search cases.
   *
   * <p>See {@link #searchCasesWithHttpInfo}.
   *
   * @param parameters Optional parameters for the request.
   * @return CompletableFuture&lt;ApiResponse&lt;CasesResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CasesResponse>> searchCasesWithHttpInfoAsync(
      SearchCasesOptionalParameters parameters) {
    Object localVarPostBody = null;
    Long pageSize = parameters.pageSize;
    Long pageNumber = parameters.pageNumber;
    CaseSortableField sortField = parameters.sortField;
    String filter = parameters.filter;
    Boolean sortAsc = parameters.sortAsc;
    // create path and map variables
    String localVarPath = "/api/v2/cases";

    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[size]", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page[number]", pageNumber));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[field]", sortField));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort[asc]", sortAsc));

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.searchCases",
              localVarPath,
              localVarQueryParams,
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CasesResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "GET",
        builder,
        localVarHeaderParams,
        new String[] {},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CasesResponse>() {});
  }

  /**
   * Unarchive case.
   *
   * <p>See {@link #unarchiveCaseWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Unarchive case payload (required)
   * @return CaseResponse
   * @throws ApiException if fails to make API call
   */
  public CaseResponse unarchiveCase(String caseId, CaseEmptyRequest body) throws ApiException {
    return unarchiveCaseWithHttpInfo(caseId, body).getData();
  }

  /**
   * Unarchive case.
   *
   * <p>See {@link #unarchiveCaseWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Unarchive case payload (required)
   * @return CompletableFuture&lt;CaseResponse&gt;
   */
  public CompletableFuture<CaseResponse> unarchiveCaseAsync(String caseId, CaseEmptyRequest body) {
    return unarchiveCaseWithHttpInfoAsync(caseId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Unarchive case
   *
   * @param caseId Case's UUID or key (required)
   * @param body Unarchive case payload (required)
   * @return ApiResponse&lt;CaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseResponse> unarchiveCaseWithHttpInfo(String caseId, CaseEmptyRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling unarchiveCase");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling unarchiveCase");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/unarchive"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.unarchiveCase",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Unarchive case.
   *
   * <p>See {@link #unarchiveCaseWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Unarchive case payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseResponse>> unarchiveCaseWithHttpInfoAsync(
      String caseId, CaseEmptyRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseId' when calling unarchiveCase"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling unarchiveCase"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/unarchive"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.unarchiveCase",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Unassign case.
   *
   * <p>See {@link #unassignCaseWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Unassign case payload (required)
   * @return CaseResponse
   * @throws ApiException if fails to make API call
   */
  public CaseResponse unassignCase(String caseId, CaseEmptyRequest body) throws ApiException {
    return unassignCaseWithHttpInfo(caseId, body).getData();
  }

  /**
   * Unassign case.
   *
   * <p>See {@link #unassignCaseWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Unassign case payload (required)
   * @return CompletableFuture&lt;CaseResponse&gt;
   */
  public CompletableFuture<CaseResponse> unassignCaseAsync(String caseId, CaseEmptyRequest body) {
    return unassignCaseWithHttpInfoAsync(caseId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Unassign case
   *
   * @param caseId Case's UUID or key (required)
   * @param body Unassign case payload (required)
   * @return ApiResponse&lt;CaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseResponse> unassignCaseWithHttpInfo(String caseId, CaseEmptyRequest body)
      throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling unassignCase");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling unassignCase");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/unassign"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.unassignCase",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Unassign case.
   *
   * <p>See {@link #unassignCaseWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Unassign case payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseResponse>> unassignCaseWithHttpInfoAsync(
      String caseId, CaseEmptyRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseId' when calling unassignCase"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling unassignCase"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/unassign"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.unassignCase",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Update case priority.
   *
   * <p>See {@link #updatePriorityWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case priority update payload (required)
   * @return CaseResponse
   * @throws ApiException if fails to make API call
   */
  public CaseResponse updatePriority(String caseId, CaseUpdatePriorityRequest body)
      throws ApiException {
    return updatePriorityWithHttpInfo(caseId, body).getData();
  }

  /**
   * Update case priority.
   *
   * <p>See {@link #updatePriorityWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case priority update payload (required)
   * @return CompletableFuture&lt;CaseResponse&gt;
   */
  public CompletableFuture<CaseResponse> updatePriorityAsync(
      String caseId, CaseUpdatePriorityRequest body) {
    return updatePriorityWithHttpInfoAsync(caseId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update case priority
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case priority update payload (required)
   * @return ApiResponse&lt;CaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseResponse> updatePriorityWithHttpInfo(
      String caseId, CaseUpdatePriorityRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling updatePriority");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updatePriority");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/priority"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.updatePriority",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Update case priority.
   *
   * <p>See {@link #updatePriorityWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case priority update payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseResponse>> updatePriorityWithHttpInfoAsync(
      String caseId, CaseUpdatePriorityRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseId' when calling updatePriority"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'body' when calling updatePriority"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/priority"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.updatePriority",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Update case status.
   *
   * <p>See {@link #updateStatusWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case status update payload (required)
   * @return CaseResponse
   * @throws ApiException if fails to make API call
   */
  public CaseResponse updateStatus(String caseId, CaseUpdateStatusRequest body)
      throws ApiException {
    return updateStatusWithHttpInfo(caseId, body).getData();
  }

  /**
   * Update case status.
   *
   * <p>See {@link #updateStatusWithHttpInfoAsync}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case status update payload (required)
   * @return CompletableFuture&lt;CaseResponse&gt;
   */
  public CompletableFuture<CaseResponse> updateStatusAsync(
      String caseId, CaseUpdateStatusRequest body) {
    return updateStatusWithHttpInfoAsync(caseId, body)
        .thenApply(
            response -> {
              return response.getData();
            });
  }

  /**
   * Update case status
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case status update payload (required)
   * @return ApiResponse&lt;CaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
   *     <table border="1">
   *    <caption>Response details</caption>
   *       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
   *       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
   *       <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
   *       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
   *       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
   *       <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
   *       <tr><td> 429 </td><td> Too many requests </td><td>  -  </td></tr>
   *     </table>
   */
  public ApiResponse<CaseResponse> updateStatusWithHttpInfo(
      String caseId, CaseUpdateStatusRequest body) throws ApiException {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      throw new ApiException(
          400, "Missing the required parameter 'caseId' when calling updateStatus");
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(
          400, "Missing the required parameter 'body' when calling updateStatus");
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/status"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder =
        apiClient.createBuilder(
            "v2.CaseManagementApi.updateStatus",
            localVarPath,
            new ArrayList<Pair>(),
            localVarHeaderParams,
            new HashMap<String, String>(),
            new String[] {"application/json"},
            new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    return apiClient.invokeAPI(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }

  /**
   * Update case status.
   *
   * <p>See {@link #updateStatusWithHttpInfo}.
   *
   * @param caseId Case's UUID or key (required)
   * @param body Case status update payload (required)
   * @return CompletableFuture&lt;ApiResponse&lt;CaseResponse&gt;&gt;
   */
  public CompletableFuture<ApiResponse<CaseResponse>> updateStatusWithHttpInfoAsync(
      String caseId, CaseUpdateStatusRequest body) {
    Object localVarPostBody = body;

    // verify the required parameter 'caseId' is set
    if (caseId == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(
              400, "Missing the required parameter 'caseId' when calling updateStatus"));
      return result;
    }

    // verify the required parameter 'body' is set
    if (body == null) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(
          new ApiException(400, "Missing the required parameter 'body' when calling updateStatus"));
      return result;
    }
    // create path and map variables
    String localVarPath =
        "/api/v2/cases/{case_id}/status"
            .replaceAll("\\{" + "case_id" + "\\}", apiClient.escapeString(caseId.toString()));

    Map<String, String> localVarHeaderParams = new HashMap<String, String>();

    Invocation.Builder builder;
    try {
      builder =
          apiClient.createBuilder(
              "v2.CaseManagementApi.updateStatus",
              localVarPath,
              new ArrayList<Pair>(),
              localVarHeaderParams,
              new HashMap<String, String>(),
              new String[] {"application/json"},
              new String[] {"apiKeyAuth", "appKeyAuth", "AuthZ"});
    } catch (ApiException ex) {
      CompletableFuture<ApiResponse<CaseResponse>> result = new CompletableFuture<>();
      result.completeExceptionally(ex);
      return result;
    }
    return apiClient.invokeAPIAsync(
        "POST",
        builder,
        localVarHeaderParams,
        new String[] {"application/json"},
        localVarPostBody,
        new HashMap<String, Object>(),
        false,
        new GenericType<CaseResponse>() {});
  }
}
