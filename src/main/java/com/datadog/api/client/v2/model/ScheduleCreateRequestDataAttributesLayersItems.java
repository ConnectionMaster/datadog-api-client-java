/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Describes a schedule layer, including rotation intervals, members, restrictions, and timeline
 * settings.
 */
@JsonPropertyOrder({
  ScheduleCreateRequestDataAttributesLayersItems.JSON_PROPERTY_EFFECTIVE_DATE,
  ScheduleCreateRequestDataAttributesLayersItems.JSON_PROPERTY_END_DATE,
  ScheduleCreateRequestDataAttributesLayersItems.JSON_PROPERTY_INTERVAL,
  ScheduleCreateRequestDataAttributesLayersItems.JSON_PROPERTY_MEMBERS,
  ScheduleCreateRequestDataAttributesLayersItems.JSON_PROPERTY_NAME,
  ScheduleCreateRequestDataAttributesLayersItems.JSON_PROPERTY_RESTRICTIONS,
  ScheduleCreateRequestDataAttributesLayersItems.JSON_PROPERTY_ROTATION_START
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScheduleCreateRequestDataAttributesLayersItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EFFECTIVE_DATE = "effective_date";
  private OffsetDateTime effectiveDate;

  public static final String JSON_PROPERTY_END_DATE = "end_date";
  private OffsetDateTime endDate;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private LayerAttributesInterval interval;

  public static final String JSON_PROPERTY_MEMBERS = "members";
  private List<ScheduleRequestDataAttributesLayersItemsMembersItems> members = new ArrayList<>();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RESTRICTIONS = "restrictions";
  private List<TimeRestriction> restrictions = null;

  public static final String JSON_PROPERTY_ROTATION_START = "rotation_start";
  private OffsetDateTime rotationStart;

  public ScheduleCreateRequestDataAttributesLayersItems() {}

  @JsonCreator
  public ScheduleCreateRequestDataAttributesLayersItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_EFFECTIVE_DATE)
          OffsetDateTime effectiveDate,
      @JsonProperty(required = true, value = JSON_PROPERTY_INTERVAL)
          LayerAttributesInterval interval,
      @JsonProperty(required = true, value = JSON_PROPERTY_MEMBERS)
          List<ScheduleRequestDataAttributesLayersItemsMembersItems> members,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_ROTATION_START)
          OffsetDateTime rotationStart) {
    this.effectiveDate = effectiveDate;
    this.interval = interval;
    this.unparsed |= interval.unparsed;
    this.members = members;
    this.name = name;
    this.rotationStart = rotationStart;
  }

  public ScheduleCreateRequestDataAttributesLayersItems effectiveDate(
      OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * The date/time when this layer becomes active (in ISO 8601).
   *
   * @return effectiveDate
   */
  @JsonProperty(JSON_PROPERTY_EFFECTIVE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(OffsetDateTime effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public ScheduleCreateRequestDataAttributesLayersItems endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The date/time after which this layer no longer applies (in ISO 8601).
   *
   * @return endDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public ScheduleCreateRequestDataAttributesLayersItems interval(LayerAttributesInterval interval) {
    this.interval = interval;
    this.unparsed |= interval.unparsed;
    return this;
  }

  /**
   * Defines how often the rotation repeats, using a combination of days and optional seconds.
   * Should be at least 1 hour.
   *
   * @return interval
   */
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LayerAttributesInterval getInterval() {
    return interval;
  }

  public void setInterval(LayerAttributesInterval interval) {
    this.interval = interval;
  }

  public ScheduleCreateRequestDataAttributesLayersItems members(
      List<ScheduleRequestDataAttributesLayersItemsMembersItems> members) {
    this.members = members;
    for (ScheduleRequestDataAttributesLayersItemsMembersItems item : members) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ScheduleCreateRequestDataAttributesLayersItems addMembersItem(
      ScheduleRequestDataAttributesLayersItemsMembersItems membersItem) {
    this.members.add(membersItem);
    this.unparsed |= membersItem.unparsed;
    return this;
  }

  /**
   * A list of members who participate in this layer's rotation.
   *
   * @return members
   */
  @JsonProperty(JSON_PROPERTY_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ScheduleRequestDataAttributesLayersItemsMembersItems> getMembers() {
    return members;
  }

  public void setMembers(List<ScheduleRequestDataAttributesLayersItemsMembersItems> members) {
    this.members = members;
  }

  public ScheduleCreateRequestDataAttributesLayersItems name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of this layer.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ScheduleCreateRequestDataAttributesLayersItems restrictions(
      List<TimeRestriction> restrictions) {
    this.restrictions = restrictions;
    for (TimeRestriction item : restrictions) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ScheduleCreateRequestDataAttributesLayersItems addRestrictionsItem(
      TimeRestriction restrictionsItem) {
    if (this.restrictions == null) {
      this.restrictions = new ArrayList<>();
    }
    this.restrictions.add(restrictionsItem);
    this.unparsed |= restrictionsItem.unparsed;
    return this;
  }

  /**
   * Zero or more time-based restrictions (for example, only weekdays, during business hours).
   *
   * @return restrictions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESTRICTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TimeRestriction> getRestrictions() {
    return restrictions;
  }

  public void setRestrictions(List<TimeRestriction> restrictions) {
    this.restrictions = restrictions;
  }

  public ScheduleCreateRequestDataAttributesLayersItems rotationStart(
      OffsetDateTime rotationStart) {
    this.rotationStart = rotationStart;
    return this;
  }

  /**
   * The date/time when the rotation for this layer starts (in ISO 8601).
   *
   * @return rotationStart
   */
  @JsonProperty(JSON_PROPERTY_ROTATION_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getRotationStart() {
    return rotationStart;
  }

  public void setRotationStart(OffsetDateTime rotationStart) {
    this.rotationStart = rotationStart;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return ScheduleCreateRequestDataAttributesLayersItems
   */
  @JsonAnySetter
  public ScheduleCreateRequestDataAttributesLayersItems putAdditionalProperty(
      String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  /** Return true if this ScheduleCreateRequestDataAttributesLayersItems object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleCreateRequestDataAttributesLayersItems scheduleCreateRequestDataAttributesLayersItems =
        (ScheduleCreateRequestDataAttributesLayersItems) o;
    return Objects.equals(
            this.effectiveDate, scheduleCreateRequestDataAttributesLayersItems.effectiveDate)
        && Objects.equals(this.endDate, scheduleCreateRequestDataAttributesLayersItems.endDate)
        && Objects.equals(this.interval, scheduleCreateRequestDataAttributesLayersItems.interval)
        && Objects.equals(this.members, scheduleCreateRequestDataAttributesLayersItems.members)
        && Objects.equals(this.name, scheduleCreateRequestDataAttributesLayersItems.name)
        && Objects.equals(
            this.restrictions, scheduleCreateRequestDataAttributesLayersItems.restrictions)
        && Objects.equals(
            this.rotationStart, scheduleCreateRequestDataAttributesLayersItems.rotationStart)
        && Objects.equals(
            this.additionalProperties,
            scheduleCreateRequestDataAttributesLayersItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        effectiveDate,
        endDate,
        interval,
        members,
        name,
        restrictions,
        rotationStart,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleCreateRequestDataAttributesLayersItems {\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    restrictions: ").append(toIndentedString(restrictions)).append("\n");
    sb.append("    rotationStart: ").append(toIndentedString(rotationStart)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
