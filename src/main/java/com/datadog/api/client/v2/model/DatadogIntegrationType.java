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

/** The definition of the <code>DatadogIntegrationType</code> object. */
@JsonSerialize(using = DatadogIntegrationType.DatadogIntegrationTypeSerializer.class)
public class DatadogIntegrationType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("Datadog"));

  public static final DatadogIntegrationType DATADOG = new DatadogIntegrationType("Datadog");

  DatadogIntegrationType(String value) {
    super(value, allowedValues);
  }

  public static class DatadogIntegrationTypeSerializer
      extends StdSerializer<DatadogIntegrationType> {
    public DatadogIntegrationTypeSerializer(Class<DatadogIntegrationType> t) {
      super(t);
    }

    public DatadogIntegrationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DatadogIntegrationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DatadogIntegrationType fromValue(String value) {
    return new DatadogIntegrationType(value);
  }
}
