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
import com.datadog.api.v1.client.model.HeatMapWidgetRequest;
import com.datadog.api.v1.client.model.WidgetAxis;
import com.datadog.api.v1.client.model.WidgetEvent;
import com.datadog.api.v1.client.model.WidgetLegendSize;
import com.datadog.api.v1.client.model.WidgetTextAlign;
import com.datadog.api.v1.client.model.WidgetTime;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.datadog.api.v1.client.model.WidgetDefinition;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The heat map visualization shows metrics aggregated across many tags, such as hosts. The more hosts that have a particular value, the darker that square is.
 */
@ApiModel(description = "The heat map visualization shows metrics aggregated across many tags, such as hosts. The more hosts that have a particular value, the darker that square is.")
@JsonPropertyOrder({
  HeatMapWidgetDefinition.JSON_PROPERTY_EVENTS,
  HeatMapWidgetDefinition.JSON_PROPERTY_LEGEND_SIZE,
  HeatMapWidgetDefinition.JSON_PROPERTY_REQUESTS,
  HeatMapWidgetDefinition.JSON_PROPERTY_SHOW_LEGEND,
  HeatMapWidgetDefinition.JSON_PROPERTY_TIME,
  HeatMapWidgetDefinition.JSON_PROPERTY_TITLE,
  HeatMapWidgetDefinition.JSON_PROPERTY_TITLE_ALIGN,
  HeatMapWidgetDefinition.JSON_PROPERTY_TITLE_SIZE,
  HeatMapWidgetDefinition.JSON_PROPERTY_TYPE,
  HeatMapWidgetDefinition.JSON_PROPERTY_YAXIS
})

public class HeatMapWidgetDefinition implements WidgetDefinition {
  public static final String JSON_PROPERTY_EVENTS = "events";
  private List<WidgetEvent> events = null;

  public static final String JSON_PROPERTY_LEGEND_SIZE = "legend_size";
  private WidgetLegendSize legendSize;

  public static final String JSON_PROPERTY_REQUESTS = "requests";
  private List<HeatMapWidgetRequest> requests = new ArrayList<>();

  public static final String JSON_PROPERTY_SHOW_LEGEND = "show_legend";
  private Boolean showLegend;

  public static final String JSON_PROPERTY_TIME = "time";
  private WidgetTime time;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TITLE_ALIGN = "title_align";
  private WidgetTextAlign titleAlign;

  public static final String JSON_PROPERTY_TITLE_SIZE = "title_size";
  private String titleSize;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "heatmap";

  public static final String JSON_PROPERTY_YAXIS = "yaxis";
  private WidgetAxis yaxis;


  public HeatMapWidgetDefinition events(List<WidgetEvent> events) {
    
    this.events = events;
    return this;
  }

  public HeatMapWidgetDefinition addEventsItem(WidgetEvent eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WidgetEvent> getEvents() {
    return events;
  }


  public void setEvents(List<WidgetEvent> events) {
    this.events = events;
  }


  public HeatMapWidgetDefinition legendSize(WidgetLegendSize legendSize) {
    
    this.legendSize = legendSize;
    return this;
  }

   /**
   * Get legendSize
   * @return legendSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEGEND_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WidgetLegendSize getLegendSize() {
    return legendSize;
  }


  public void setLegendSize(WidgetLegendSize legendSize) {
    this.legendSize = legendSize;
  }


  public HeatMapWidgetDefinition requests(List<HeatMapWidgetRequest> requests) {
    
    this.requests = requests;
    return this;
  }

  public HeatMapWidgetDefinition addRequestsItem(HeatMapWidgetRequest requestsItem) {
    this.requests.add(requestsItem);
    return this;
  }

   /**
   * Get requests
   * @return requests
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<HeatMapWidgetRequest> getRequests() {
    return requests;
  }


  public void setRequests(List<HeatMapWidgetRequest> requests) {
    this.requests = requests;
  }


  public HeatMapWidgetDefinition showLegend(Boolean showLegend) {
    
    this.showLegend = showLegend;
    return this;
  }

   /**
   * Whether or not to display the legend on this widget
   * @return showLegend
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether or not to display the legend on this widget")
  @JsonProperty(JSON_PROPERTY_SHOW_LEGEND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getShowLegend() {
    return showLegend;
  }


  public void setShowLegend(Boolean showLegend) {
    this.showLegend = showLegend;
  }


  public HeatMapWidgetDefinition time(WidgetTime time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WidgetTime getTime() {
    return time;
  }


  public void setTime(WidgetTime time) {
    this.time = time;
  }


  public HeatMapWidgetDefinition title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Title of the widget
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Title of the widget")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public HeatMapWidgetDefinition titleAlign(WidgetTextAlign titleAlign) {
    
    this.titleAlign = titleAlign;
    return this;
  }

   /**
   * Get titleAlign
   * @return titleAlign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TITLE_ALIGN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WidgetTextAlign getTitleAlign() {
    return titleAlign;
  }


  public void setTitleAlign(WidgetTextAlign titleAlign) {
    this.titleAlign = titleAlign;
  }


  public HeatMapWidgetDefinition titleSize(String titleSize) {
    
    this.titleSize = titleSize;
    return this;
  }

   /**
   * Size of the title
   * @return titleSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Size of the title")
  @JsonProperty(JSON_PROPERTY_TITLE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitleSize() {
    return titleSize;
  }


  public void setTitleSize(String titleSize) {
    this.titleSize = titleSize;
  }


   /**
   * Type of the widget
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of the widget")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }




  public HeatMapWidgetDefinition yaxis(WidgetAxis yaxis) {
    
    this.yaxis = yaxis;
    return this;
  }

   /**
   * Get yaxis
   * @return yaxis
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_YAXIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WidgetAxis getYaxis() {
    return yaxis;
  }


  public void setYaxis(WidgetAxis yaxis) {
    this.yaxis = yaxis;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatMapWidgetDefinition heatMapWidgetDefinition = (HeatMapWidgetDefinition) o;
    return Objects.equals(this.events, heatMapWidgetDefinition.events) &&
        Objects.equals(this.legendSize, heatMapWidgetDefinition.legendSize) &&
        Objects.equals(this.requests, heatMapWidgetDefinition.requests) &&
        Objects.equals(this.showLegend, heatMapWidgetDefinition.showLegend) &&
        Objects.equals(this.time, heatMapWidgetDefinition.time) &&
        Objects.equals(this.title, heatMapWidgetDefinition.title) &&
        Objects.equals(this.titleAlign, heatMapWidgetDefinition.titleAlign) &&
        Objects.equals(this.titleSize, heatMapWidgetDefinition.titleSize) &&
        Objects.equals(this.type, heatMapWidgetDefinition.type) &&
        Objects.equals(this.yaxis, heatMapWidgetDefinition.yaxis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(events, legendSize, requests, showLegend, time, title, titleAlign, titleSize, type, yaxis);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatMapWidgetDefinition {\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    legendSize: ").append(toIndentedString(legendSize)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    showLegend: ").append(toIndentedString(showLegend)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    titleAlign: ").append(toIndentedString(titleAlign)).append("\n");
    sb.append("    titleSize: ").append(toIndentedString(titleSize)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    yaxis: ").append(toIndentedString(yaxis)).append("\n");
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

