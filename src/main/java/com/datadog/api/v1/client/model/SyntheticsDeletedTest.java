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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v1.client.JSON;


/**
 * Object containing a deleted Synthetic test ID with the associated deletion timestamp.
 */
@ApiModel(description = "Object containing a deleted Synthetic test ID with the associated deletion timestamp.")
@JsonPropertyOrder({
  SyntheticsDeletedTest.JSON_PROPERTY_DELETED_AT,
  SyntheticsDeletedTest.JSON_PROPERTY_PUBLIC_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SyntheticsDeletedTest {
  public static final String JSON_PROPERTY_DELETED_AT = "deleted_at";
  private OffsetDateTime deletedAt;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;


  public SyntheticsDeletedTest deletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Deletion timestamp of the Synthetic test ID.
   * @return deletedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deletion timestamp of the Synthetic test ID.")
  @JsonProperty(JSON_PROPERTY_DELETED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDeletedAt() {
    return deletedAt;
  }


  public void setDeletedAt(OffsetDateTime deletedAt) {
    this.deletedAt = deletedAt;
  }


  public SyntheticsDeletedTest publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

   /**
   * The Synthetic test ID deleted.
   * @return publicId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Synthetic test ID deleted.")
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPublicId() {
    return publicId;
  }


  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }


  /**
   * Return true if this SyntheticsDeletedTest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsDeletedTest syntheticsDeletedTest = (SyntheticsDeletedTest) o;
    return Objects.equals(this.deletedAt, syntheticsDeletedTest.deletedAt) &&
        Objects.equals(this.publicId, syntheticsDeletedTest.publicId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedAt, publicId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsDeletedTest {\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
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
