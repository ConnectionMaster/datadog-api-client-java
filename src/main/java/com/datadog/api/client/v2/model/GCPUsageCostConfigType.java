/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** Type of GCP Usage Cost config. */
@JsonSerialize(using = GCPUsageCostConfigType.GCPUsageCostConfigTypeSerializer.class)
public class GCPUsageCostConfigType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("gcp_uc_config"));

  public static final GCPUsageCostConfigType GCP_UC_CONFIG =
      new GCPUsageCostConfigType("gcp_uc_config");

  GCPUsageCostConfigType(String value) {
    super(value, allowedValues);
  }

  public static class GCPUsageCostConfigTypeSerializer
      extends StdSerializer<GCPUsageCostConfigType> {
    public GCPUsageCostConfigTypeSerializer(Class<GCPUsageCostConfigType> t) {
      super(t);
    }

    public GCPUsageCostConfigTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GCPUsageCostConfigType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GCPUsageCostConfigType fromValue(String value) {
    return new GCPUsageCostConfigType(value);
  }
}
