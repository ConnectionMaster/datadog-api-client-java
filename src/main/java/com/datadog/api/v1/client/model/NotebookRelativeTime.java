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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/** Relative timeframe. */
@ApiModel(description = "Relative timeframe.")
@JsonPropertyOrder({NotebookRelativeTime.JSON_PROPERTY_LIVE_SPAN})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NotebookRelativeTime {
  public static final String JSON_PROPERTY_LIVE_SPAN = "live_span";
  private WidgetLiveSpan liveSpan;

  public NotebookRelativeTime() {}

  @JsonCreator
  public NotebookRelativeTime(
      @JsonProperty(required = true, value = JSON_PROPERTY_LIVE_SPAN) WidgetLiveSpan liveSpan) {
    this.liveSpan = liveSpan;
  }

  public NotebookRelativeTime liveSpan(WidgetLiveSpan liveSpan) {
    this.liveSpan = liveSpan;
    return this;
  }

  /**
   * Get liveSpan
   *
   * @return liveSpan
   */
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LIVE_SPAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public WidgetLiveSpan getLiveSpan() {
    return liveSpan;
  }

  public void setLiveSpan(WidgetLiveSpan liveSpan) {
    this.liveSpan = liveSpan;
  }

  /** Return true if this NotebookRelativeTime object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookRelativeTime notebookRelativeTime = (NotebookRelativeTime) o;
    return Objects.equals(this.liveSpan, notebookRelativeTime.liveSpan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(liveSpan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookRelativeTime {\n");
    sb.append("    liveSpan: ").append(toIndentedString(liveSpan)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}