package com.laundry.laundrysample.common.constant.converter;

import org.springframework.format.Formatter;

import java.time.LocalDateTime;
import java.util.Locale;

import static com.laundry.laundrysample.common.constant.DateTimeFormatConstants.yyyyMMddHHmmss;


public class LocalDateTimeFormatter implements Formatter<LocalDateTime> {

    @Override
    public LocalDateTime parse(String text, Locale locale) {
        return LocalDateTime.parse(text, yyyyMMddHHmmss);
    }

    @Override
    public String print(LocalDateTime obj, Locale locale) {
        return yyyyMMddHHmmss.format(obj);
    }
}
