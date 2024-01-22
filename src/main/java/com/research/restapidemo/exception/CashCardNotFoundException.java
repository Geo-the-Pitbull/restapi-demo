package com.research.restapidemo.exception;

public class CashCardNotFoundException extends RuntimeException {
    
    public CashCardNotFoundException(String message) {
        super(message);
    }

    public CashCardNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
