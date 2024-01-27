package com.research.restapidemo.exception;

public class FamilyDetailNotFoundException extends RuntimeException {
    
    public FamilyDetailNotFoundException(String message) {
        super(message);
    }

    public FamilyDetailNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

}
