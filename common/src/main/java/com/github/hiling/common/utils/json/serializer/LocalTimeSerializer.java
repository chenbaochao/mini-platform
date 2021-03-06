package com.github.hiling.common.utils.json.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Author by hiling, Email admin@mn-soft.com, Date on 11/26/2018.
 * 适用于jdk1.8及以上
 */
public class LocalTimeSerializer extends JsonSerializer<LocalTime> {

    private static final DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    @Override
    public void serialize(LocalTime value, JsonGenerator jgen, SerializerProvider provider)
            throws IOException {
        jgen.writeString(timeFormatter.format(value));
    }
}