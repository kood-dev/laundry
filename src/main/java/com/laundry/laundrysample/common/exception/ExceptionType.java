package com.laundry.laundrysample.common.exception;

import com.laundry.laundrysample.common.component.CommonBeans;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

/**
 * 공통 예외 유형
 * 공통 응답의 code, status, default message 를 구조화
 *
 * 1xx: Informational - Request received, continuing process
 * 2xx: Success - The action was successfully received, understood, and accepted
 * 3xx: Redirection - Further action must be taken in order to complete the request
 * 4xx: Client Error - The request contains bad syntax or cannot be fulfilled
 * 5xx: Server Error - The server failed to fulfill an apparently valid request
 */
@RequiredArgsConstructor
public enum ExceptionType {
    // standard
    BAD_REQUEST("301", HttpStatus.BAD_REQUEST.value(), "exception.standard.badRequest"),
    UNAUTHORIZED("302", HttpStatus.UNAUTHORIZED.value(), "exception.standard.unauthorized"),
    FORBIDDEN("303", HttpStatus.FORBIDDEN.value(), "exception.standard.forbidden"),
    NOT_FOUND("304", HttpStatus.NOT_FOUND.value(), "exception.standard.notFound"),
    UNEXPECTED("305", HttpStatus.INTERNAL_SERVER_ERROR.value(), "exception.standard.unexpected"),

    // business
    INVALID_REQUEST("021", HttpStatus.BAD_REQUEST.value(), "exception.common.validation.request"),
    NOT_FOUND_RESULT("401", HttpStatus.NOT_FOUND.value(), "exception.business.notFound.result");

    @NonNull
    private final String code;
    private final int status;
    private final String messageCode;

    public String getCode() {
        return status + code;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        try {
            return CommonBeans.messageComponent.getMessage(messageCode);
        } catch (Exception e) {
            return messageCode;
        }
    }

}
