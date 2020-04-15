/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v1.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.datadog.api.v1.client.model.CheckCanDeleteMonitorResponseData;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Response of monitor IDs that can or can&#39;t be safely deleted.
 */
@ApiModel(description = "Response of monitor IDs that can or can't be safely deleted.")
@JsonPropertyOrder({
  CheckCanDeleteMonitorResponse.JSON_PROPERTY_DATA,
  CheckCanDeleteMonitorResponse.JSON_PROPERTY_ERRORS
})

public class CheckCanDeleteMonitorResponse {
  public static final String JSON_PROPERTY_DATA = "data";
  private CheckCanDeleteMonitorResponseData data;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private Map<String, List<String>> errors = null;


  public CheckCanDeleteMonitorResponse data(CheckCanDeleteMonitorResponseData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CheckCanDeleteMonitorResponseData getData() {
    return data;
  }


  public void setData(CheckCanDeleteMonitorResponseData data) {
    this.data = data;
  }


  public CheckCanDeleteMonitorResponse errors(Map<String, List<String>> errors) {
    
    this.errors = errors;
    return this;
  }

  public CheckCanDeleteMonitorResponse putErrorsItem(String key, List<String> errorsItem) {
    if (this.errors == null) {
      this.errors = new HashMap<>();
    }
    this.errors.put(key, errorsItem);
    return this;
  }

   /**
   * A mapping of Monitor ID to strings denoting where it&#39;s used.
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A mapping of Monitor ID to strings denoting where it's used.")
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, List<String>> getErrors() {
    return errors;
  }


  public void setErrors(Map<String, List<String>> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckCanDeleteMonitorResponse checkCanDeleteMonitorResponse = (CheckCanDeleteMonitorResponse) o;
    return Objects.equals(this.data, checkCanDeleteMonitorResponse.data) &&
        Objects.equals(this.errors, checkCanDeleteMonitorResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckCanDeleteMonitorResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
