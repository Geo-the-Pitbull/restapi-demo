package com.research.restapidemo.exception;

import org.springframework.http.HttpStatus;

public class CashCardException {
    
    private final String message;
    private final Throwable throwable;
    private final HttpStatus httpStatus;

    public CashCardException(String message, Throwable throwable, HttpStatus httpStatus) {
        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
    }

    // Getters
    public String getMessage() {
        return message;
    }
    public Throwable getThrowable() {
        return throwable;
    }
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
