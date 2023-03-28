package com.laundry.laundrysample.common.constant.converter;

import org.springframework.format.Formatter;

import java.time.LocalDate;
import java.util.Locale;

import static com.laundry.laundrysample.common.constant.DateTimeFormatConstants.yyyyMMdd;


public class LocalDateFormatter implements Formatter<LocalDate> {

    @Override
    public LocalDate parse(String text, Locale locale) {
        return LocalDate.parse(text, yyyyMMdd);
    }

    @Override
    public String print(LocalDate obj, Locale locale) {
        return yyyyMMdd.format(obj);
    }
}
