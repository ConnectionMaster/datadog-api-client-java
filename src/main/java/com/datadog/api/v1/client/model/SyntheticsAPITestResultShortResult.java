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
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v1.client.model.SyntheticsTiming;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Result of the last API test run.
 */
@ApiModel(description = "Result of the last API test run.")
@JsonPropertyOrder({
  SyntheticsAPITestResultShortResult.JSON_PROPERTY_TIMINGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SyntheticsAPITestResultShortResult {
  public static final String JSON_PROPERTY_TIMINGS = "timings";
  private SyntheticsTiming timings;


  public SyntheticsAPITestResultShortResult timings(SyntheticsTiming timings) {
    this.timings = timings;
    return this;
  }

   /**
   * Get timings
   * @return timings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIMINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SyntheticsTiming getTimings() {
    return timings;
  }


  public void setTimings(SyntheticsTiming timings) {
    this.timings = timings;
  }


  /**
   * Return true if this SyntheticsAPITestResultShort_result object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsAPITestResultShortResult syntheticsAPITestResultShortResult = (SyntheticsAPITestResultShortResult) o;
    return Objects.equals(this.timings, syntheticsAPITestResultShortResult.timings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsAPITestResultShortResult {\n");
    sb.append("    timings: ").append(toIndentedString(timings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

