package com.ost.matie.global.config;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Converter
public class LongListConverter implements AttributeConverter<List<Long>, String> {
    private static final String SPLIT_CHAR = ", ";

    @Override
    public String convertToDatabaseColumn(List<Long> attribute) {
        return attribute.isEmpty() ? "" : attribute.stream().map(String::valueOf).collect(Collectors.joining(SPLIT_CHAR));
    }

    @Override
    public List<Long> convertToEntityAttribute(String dbData) {
        return dbData.equals("") ? Collections.emptyList() :
                Arrays.stream(dbData.split(SPLIT_CHAR))
                .map(Long::parseLong)
                .collect(Collectors.toList());
    }
}
