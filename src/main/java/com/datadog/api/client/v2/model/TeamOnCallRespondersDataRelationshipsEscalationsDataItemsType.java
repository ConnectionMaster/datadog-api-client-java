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

/**
 * Identifies the resource type for escalation policy steps linked to a team's on-call
 * configuration.
 */
@JsonSerialize(
    using =
        TeamOnCallRespondersDataRelationshipsEscalationsDataItemsType
            .TeamOnCallRespondersDataRelationshipsEscalationsDataItemsTypeSerializer.class)
public class TeamOnCallRespondersDataRelationshipsEscalationsDataItemsType
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("escalation_policy_steps"));

  public static final TeamOnCallRespondersDataRelationshipsEscalationsDataItemsType
      ESCALATION_POLICY_STEPS =
          new TeamOnCallRespondersDataRelationshipsEscalationsDataItemsType(
              "escalation_policy_steps");

  TeamOnCallRespondersDataRelationshipsEscalationsDataItemsType(String value) {
    super(value, allowedValues);
  }

  public static class TeamOnCallRespondersDataRelationshipsEscalationsDataItemsTypeSerializer
      extends StdSerializer<TeamOnCallRespondersDataRelationshipsEscalationsDataItemsType> {
    public TeamOnCallRespondersDataRelationshipsEscalationsDataItemsTypeSerializer(
        Class<TeamOnCallRespondersDataRelationshipsEscalationsDataItemsType> t) {
      super(t);
    }

    public TeamOnCallRespondersDataRelationshipsEscalationsDataItemsTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TeamOnCallRespondersDataRelationshipsEscalationsDataItemsType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TeamOnCallRespondersDataRelationshipsEscalationsDataItemsType fromValue(
      String value) {
    return new TeamOnCallRespondersDataRelationshipsEscalationsDataItemsType(value);
  }
}
