package com.laundry.laundrysample.common.constant.converter;

import com.laundry.laundrysample.common.constant.CommonCodeType;
import com.laundry.laundrysample.common.constant.type.YNType;
import jakarta.persistence.Converter;

import jakarta.persistence.AttributeConverter;

import java.util.EnumSet;
import java.util.NoSuchElementException;

@Converter
public class CommonCodeConverter<E extends Enum<E> & CommonCodeType> implements AttributeConverter<E, String> {
    private Class<E> clz;

    CommonCodeConverter(Class<E> enumClass) {
        this.clz = enumClass;
    }

    @Override
    public String convertToDatabaseColumn(E attribute) {
        if (attribute == null) return null;

        return attribute.getCode();
    }

    @Override
    public E convertToEntityAttribute(String dbData) {
        if (dbData == null) return null;

        return EnumSet.allOf(clz).stream()
                .filter(e -> e.getCode().equals(dbData))
                .findAny()
                .orElseThrow(NoSuchElementException::new);
    }
}
@Converter(autoApply = true)
class YNTypeConverter extends CommonCodeConverter<YNType> {
    YNTypeConverter() {
        super(YNType.class);
    }
}

