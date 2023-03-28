package com.laundry.laundrysample.common.component;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class CommonBeans {
    public static MessageComponent messageComponent;
    public static ObjectMapper objectMapper;
    private final MessageComponent messageComponentBean;
    private final ObjectMapper objectMapperBean;
    @PostConstruct
    private void initialize() {
        messageComponent = messageComponentBean;
        objectMapper = objectMapperBean;
    }
}
