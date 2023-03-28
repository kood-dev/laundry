package com.laundry.laundrysample.common.constant.converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.laundry.laundrysample.common.exception.BusinessException;
import com.laundry.laundrysample.common.exception.ExceptionType;
import jakarta.persistence.AttributeConverter;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
public class MapToStringConverter implements AttributeConverter<Map<String, Object>, String> {
    private final ObjectMapper objectMapper;
    @Override
    public String convertToDatabaseColumn(Map<String, Object> attribute) {
        if (attribute != null) {
            try {
                return objectMapper.writeValueAsString(attribute);
            } catch (JsonProcessingException e) {
                throw new BusinessException(ExceptionType.UNEXPECTED, "Json 객체의 문자열 변환에 실패하였습니다.");
            }
        }

        return null;
    }

    @Override
    public Map<String, Object> convertToEntityAttribute(String dbData) {
        if (dbData != null) {
            try {
                return objectMapper.readValue(dbData, new TypeReference<HashMap<String, Object>>() {});
            } catch (JsonProcessingException e) {
                throw new BusinessException(ExceptionType.UNEXPECTED, "문자열의 Json 객체 변환에 실패하였습니다.");
            }
        }

        return null;
    }
}
