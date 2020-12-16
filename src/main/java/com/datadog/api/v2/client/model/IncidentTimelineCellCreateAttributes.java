/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v2.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v2.client.model.IncidentTimelineCellMarkdownContentType;
import com.datadog.api.v2.client.model.IncidentTimelineCellMarkdownCreateAttributes;
import com.datadog.api.v2.client.model.IncidentTimelineCellMarkdownCreateAttributesContent;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v2.client.JSON;

import com.fasterxml.jackson.core.type.TypeReference;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.datadog.api.v2.client.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonDeserialize(using = IncidentTimelineCellCreateAttributes.IncidentTimelineCellCreateAttributesDeserializer.class)
@JsonSerialize(using = IncidentTimelineCellCreateAttributes.IncidentTimelineCellCreateAttributesSerializer.class)
public class IncidentTimelineCellCreateAttributes extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(IncidentTimelineCellCreateAttributes.class.getName());

    public static class IncidentTimelineCellCreateAttributesSerializer extends StdSerializer<IncidentTimelineCellCreateAttributes> {
        public IncidentTimelineCellCreateAttributesSerializer(Class<IncidentTimelineCellCreateAttributes> t) {
            super(t);
        }

        public IncidentTimelineCellCreateAttributesSerializer() {
            this(null);
        }

        @Override
        public void serialize(IncidentTimelineCellCreateAttributes value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
            jgen.writeObject(value.getActualInstance());
        }
    }

    public static class IncidentTimelineCellCreateAttributesDeserializer extends StdDeserializer<IncidentTimelineCellCreateAttributes> {
        public IncidentTimelineCellCreateAttributesDeserializer() {
            this(IncidentTimelineCellCreateAttributes.class);
        }

        public IncidentTimelineCellCreateAttributesDeserializer(Class<?> vc) {
            super(vc);
        }

        @Override
        public IncidentTimelineCellCreateAttributes deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
            JsonNode tree = jp.readValueAsTree();
            Object deserialized = null;
            boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
            int match = 0;
            JsonToken token = tree.traverse(jp.getCodec()).nextToken();
            // deserialize IncidentTimelineCellMarkdownCreateAttributes
            try {
                boolean attemptParsing = true;
                // ensure that we respect type coercion as set on the client ObjectMapper
                if (IncidentTimelineCellMarkdownCreateAttributes.class.equals(Integer.class) || IncidentTimelineCellMarkdownCreateAttributes.class.equals(Long.class) || IncidentTimelineCellMarkdownCreateAttributes.class.equals(Float.class) || IncidentTimelineCellMarkdownCreateAttributes.class.equals(Double.class) || IncidentTimelineCellMarkdownCreateAttributes.class.equals(Boolean.class) || IncidentTimelineCellMarkdownCreateAttributes.class.equals(String.class)) {
                    attemptParsing = typeCoercion;
                    if (!attemptParsing) {
                        attemptParsing |= ((IncidentTimelineCellMarkdownCreateAttributes.class.equals(Integer.class) || IncidentTimelineCellMarkdownCreateAttributes.class.equals(Long.class)) && token == JsonToken.VALUE_NUMBER_INT);
                        attemptParsing |= ((IncidentTimelineCellMarkdownCreateAttributes.class.equals(Float.class) || IncidentTimelineCellMarkdownCreateAttributes.class.equals(Double.class)) && token == JsonToken.VALUE_NUMBER_FLOAT);
                        attemptParsing |= (IncidentTimelineCellMarkdownCreateAttributes.class.equals(Boolean.class) && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
                        attemptParsing |= (IncidentTimelineCellMarkdownCreateAttributes.class.equals(String.class) && token == JsonToken.VALUE_STRING);
                    }
                }
                if (attemptParsing) {
                    deserialized = tree.traverse(jp.getCodec()).readValueAs(IncidentTimelineCellMarkdownCreateAttributes.class);
                    // TODO: there is no validation against JSON schema constraints
                    // (min, max, enum, pattern...), this does not perform a strict JSON
                    // validation, which means the 'match' count may be higher than it should be.
                    match++;
                    log.log(Level.FINER, "Input data matches schema 'IncidentTimelineCellMarkdownCreateAttributes'");
                }
            } catch (Exception e) {
                // deserialization failed, continue
                log.log(Level.FINER, "Input data does not match schema 'IncidentTimelineCellMarkdownCreateAttributes'", e);
            }

            if (match == 1) {
                IncidentTimelineCellCreateAttributes ret = new IncidentTimelineCellCreateAttributes();
                ret.setActualInstance(deserialized);
                return ret;
            }
            throw new IOException(String.format("Failed deserialization for IncidentTimelineCellCreateAttributes: %d classes match result, expected 1", match));
        }

        /**
         * Handle deserialization of the 'null' value.
         */
        @Override
        public IncidentTimelineCellCreateAttributes getNullValue(DeserializationContext ctxt) throws JsonMappingException {
            throw new JsonMappingException(ctxt.getParser(), "IncidentTimelineCellCreateAttributes cannot be null");
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public IncidentTimelineCellCreateAttributes() {
        super("oneOf", Boolean.FALSE);
    }

    public IncidentTimelineCellCreateAttributes(IncidentTimelineCellMarkdownCreateAttributes o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("IncidentTimelineCellMarkdownCreateAttributes", new GenericType<IncidentTimelineCellMarkdownCreateAttributes>() {
        });
        JSON.registerDescendants(IncidentTimelineCellCreateAttributes.class, Collections.unmodifiableMap(schemas));
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return IncidentTimelineCellCreateAttributes.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * IncidentTimelineCellMarkdownCreateAttributes
     *
     * It could be an instance of the 'oneOf' schemas.
     * The oneOf child schemas may themselves be a composed schema (allOf, anyOf, oneOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (JSON.isInstanceOf(IncidentTimelineCellMarkdownCreateAttributes.class, instance, new HashSet<Class<?>>())) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be IncidentTimelineCellMarkdownCreateAttributes");
    }

    /**
     * Get the actual instance, which can be the following:
     * IncidentTimelineCellMarkdownCreateAttributes
     *
     * @return The actual instance (IncidentTimelineCellMarkdownCreateAttributes)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `IncidentTimelineCellMarkdownCreateAttributes`. If the actual instanct is not `IncidentTimelineCellMarkdownCreateAttributes`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `IncidentTimelineCellMarkdownCreateAttributes`
     * @throws ClassCastException if the instance is not `IncidentTimelineCellMarkdownCreateAttributes`
     */
    public IncidentTimelineCellMarkdownCreateAttributes getIncidentTimelineCellMarkdownCreateAttributes() throws ClassCastException {
        return (IncidentTimelineCellMarkdownCreateAttributes)super.getActualInstance();
    }

}

