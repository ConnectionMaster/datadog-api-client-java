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
import com.datadog.api.v1.client.model.IFrameWidgetDefinitionType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The iframe widget allows you to embed a portion of any other web page on your dashboard. Only available on FREE layout dashboards.
 */
@ApiModel(description = "The iframe widget allows you to embed a portion of any other web page on your dashboard. Only available on FREE layout dashboards.")
@JsonPropertyOrder({
  IFrameWidgetDefinition.JSON_PROPERTY_TYPE,
  IFrameWidgetDefinition.JSON_PROPERTY_URL
})

public class IFrameWidgetDefinition {
  public static final String JSON_PROPERTY_TYPE = "type";
  private IFrameWidgetDefinitionType type = IFrameWidgetDefinitionType.IFRAME;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;


  public IFrameWidgetDefinition type(IFrameWidgetDefinitionType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public IFrameWidgetDefinitionType getType() {
    return type;
  }


  public void setType(IFrameWidgetDefinitionType type) {
    this.type = type;
  }


  public IFrameWidgetDefinition url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL of the iframe.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "URL of the iframe.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IFrameWidgetDefinition iframeWidgetDefinition = (IFrameWidgetDefinition) o;
    return Objects.equals(this.type, iframeWidgetDefinition.type) &&
        Objects.equals(this.url, iframeWidgetDefinition.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IFrameWidgetDefinition {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

