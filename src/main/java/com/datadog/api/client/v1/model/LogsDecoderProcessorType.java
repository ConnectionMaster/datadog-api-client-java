/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Type of logs decoder processor. */
@JsonSerialize(using = LogsDecoderProcessorType.LogsDecoderProcessorTypeSerializer.class)
public class LogsDecoderProcessorType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("decoder-processor"));

  public static final LogsDecoderProcessorType DECODER_PROCESSOR =
      new LogsDecoderProcessorType("decoder-processor");

  LogsDecoderProcessorType(String value) {
    super(value, allowedValues);
  }

  public static class LogsDecoderProcessorTypeSerializer
      extends StdSerializer<LogsDecoderProcessorType> {
    public LogsDecoderProcessorTypeSerializer(Class<LogsDecoderProcessorType> t) {
      super(t);
    }

    public LogsDecoderProcessorTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LogsDecoderProcessorType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LogsDecoderProcessorType fromValue(String value) {
    return new LogsDecoderProcessorType(value);
  }
}
