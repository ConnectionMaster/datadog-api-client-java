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
import com.datadog.api.v1.client.model.SLOTimeframe;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SLO thresholds (target and optionally warning) for a single time window.
 */
@ApiModel(description = "SLO thresholds (target and optionally warning) for a single time window.")
@JsonPropertyOrder({
  SLOThreshold.JSON_PROPERTY_TARGET,
  SLOThreshold.JSON_PROPERTY_TARGET_DISPLAY,
  SLOThreshold.JSON_PROPERTY_TIMEFRAME,
  SLOThreshold.JSON_PROPERTY_WARNING,
  SLOThreshold.JSON_PROPERTY_WARNING_DISPLAY
})

public class SLOThreshold {
  public static final String JSON_PROPERTY_TARGET = "target";
  private Double target;

  public static final String JSON_PROPERTY_TARGET_DISPLAY = "target_display";
  private String targetDisplay;

  public static final String JSON_PROPERTY_TIMEFRAME = "timeframe";
  private SLOTimeframe timeframe;

  public static final String JSON_PROPERTY_WARNING = "warning";
  private Double warning;

  public static final String JSON_PROPERTY_WARNING_DISPLAY = "warning_display";
  private String warningDisplay;


  public SLOThreshold target(Double target) {
    
    this.target = target;
    return this;
  }

   /**
   * The target value for the service level indicator within the corresponding timeframe.
   * @return target
  **/
  @ApiModelProperty(example = "0.0", required = true, value = "The target value for the service level indicator within the corresponding timeframe.")
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getTarget() {
    return target;
  }


  public void setTarget(Double target) {
    this.target = target;
  }


  public SLOThreshold targetDisplay(String targetDisplay) {
    
    this.targetDisplay = targetDisplay;
    return this;
  }

   /**
   * A string representation of the target that indicates its precision. It uses trailing zeros to show significant decimal places (e.g. &#x60;98.00&#x60;).  Always included in service level objective responses. Ignored in create/update requests.
   * @return targetDisplay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "99.9", value = "A string representation of the target that indicates its precision. It uses trailing zeros to show significant decimal places (e.g. `98.00`).  Always included in service level objective responses. Ignored in create/update requests.")
  @JsonProperty(JSON_PROPERTY_TARGET_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTargetDisplay() {
    return targetDisplay;
  }


  public void setTargetDisplay(String targetDisplay) {
    this.targetDisplay = targetDisplay;
  }


  public SLOThreshold timeframe(SLOTimeframe timeframe) {
    
    this.timeframe = timeframe;
    return this;
  }

   /**
   * Get timeframe
   * @return timeframe
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TIMEFRAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SLOTimeframe getTimeframe() {
    return timeframe;
  }


  public void setTimeframe(SLOTimeframe timeframe) {
    this.timeframe = timeframe;
  }


  public SLOThreshold warning(Double warning) {
    
    this.warning = warning;
    return this;
  }

   /**
   * The warning value for the service level objective.
   * @return warning
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The warning value for the service level objective.")
  @JsonProperty(JSON_PROPERTY_WARNING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getWarning() {
    return warning;
  }


  public void setWarning(Double warning) {
    this.warning = warning;
  }


  public SLOThreshold warningDisplay(String warningDisplay) {
    
    this.warningDisplay = warningDisplay;
    return this;
  }

   /**
   * A string representation of the warning target (see the description of the &#x60;target_display&#x60; field for details).  Included in service level objective responses if a warning target exists. Ignored in create/update requests.
   * @return warningDisplay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A string representation of the warning target (see the description of the `target_display` field for details).  Included in service level objective responses if a warning target exists. Ignored in create/update requests.")
  @JsonProperty(JSON_PROPERTY_WARNING_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWarningDisplay() {
    return warningDisplay;
  }


  public void setWarningDisplay(String warningDisplay) {
    this.warningDisplay = warningDisplay;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOThreshold slOThreshold = (SLOThreshold) o;
    return Objects.equals(this.target, slOThreshold.target) &&
        Objects.equals(this.targetDisplay, slOThreshold.targetDisplay) &&
        Objects.equals(this.timeframe, slOThreshold.timeframe) &&
        Objects.equals(this.warning, slOThreshold.warning) &&
        Objects.equals(this.warningDisplay, slOThreshold.warningDisplay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, targetDisplay, timeframe, warning, warningDisplay);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOThreshold {\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    targetDisplay: ").append(toIndentedString(targetDisplay)).append("\n");
    sb.append("    timeframe: ").append(toIndentedString(timeframe)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
    sb.append("    warningDisplay: ").append(toIndentedString(warningDisplay)).append("\n");
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

