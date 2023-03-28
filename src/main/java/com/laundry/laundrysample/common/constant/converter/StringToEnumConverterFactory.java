package com.laundry.laundrysample.common.constant.converter;

import com.laundry.laundrysample.common.constant.CommonCodeType;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;

import java.util.Arrays;
import java.util.EnumSet;

public class StringToEnumConverterFactory implements ConverterFactory<String, Enum> {
    @Override
    public <T extends Enum> Converter<String, T> getConverter(Class<T> targetType) {
        return new StringToEnumConverter<>(targetType);
    }

    private final class StringToEnumConverter<E extends Enum> implements Converter<String, E> {
        private Class<E> clz;
        private boolean isCommonCode = false;

        public StringToEnumConverter(Class<E> enumClass) {
            this.clz = enumClass;
            if (Arrays.asList(enumClass.getInterfaces()).contains(CommonCodeType.class)) {
                isCommonCode = true;
            }
        }

        @Override
        public E convert(String source) {
            if (!isCommonCode) {
                return (E) Enum.valueOf(clz, source);
            } else {
                return (E) EnumSet.allOf(clz).stream()
                        .filter(e -> ((CommonCodeType) e).getCode().equals(source))
                        .findAny()
                        .orElseThrow();
            }
        }
    }
}
