package com.laundry.laundrysample.common.exception.handler;

import com.laundry.laundrysample.common.exception.BusinessException;
import com.laundry.laundrysample.common.model.CommonErrorResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class CommonExceptionAdvice {

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<CommonErrorResponse> handleException(BusinessException businessException) {
        log.error("Business exception occurred");
        return ResponseEntity.status(businessException.getExceptionType().getStatus()).body(CommonErrorResponse.of(businessException));
    }

}
