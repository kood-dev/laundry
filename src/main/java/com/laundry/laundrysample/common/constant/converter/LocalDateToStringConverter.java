package com.laundry.laundrysample.common.constant.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Converter(autoApply = true)
public class LocalDateToStringConverter implements AttributeConverter<LocalDate, String> {
    public final static String LOCAL_DATE_DB_FORMAT = "yyyyMMdd";
    @Override
    public String convertToDatabaseColumn(LocalDate attribute) {
        if (attribute == null)
            return null;

        return DateTimeFormatter.ofPattern(LOCAL_DATE_DB_FORMAT).format(attribute);
    }

    @Override
    public LocalDate convertToEntityAttribute(String dbData) {
        if (dbData == null)
            return null;

        return LocalDate.parse(dbData, DateTimeFormatter.ofPattern(LOCAL_DATE_DB_FORMAT));
    }
}