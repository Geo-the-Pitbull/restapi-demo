package com.research.restapidemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class FamilyDetailExceptionHandler {

    @ExceptionHandler(value = {FamilyDetailNotFoundException.class})
    public ResponseEntity<Object> handleFamilyDetailNotFoundException(FamilyDetailNotFoundException familyDetailNotFoundException) {
        FamilyDetailException familyDetailException = new FamilyDetailException(
            familyDetailNotFoundException.getMessage(),
            familyDetailNotFoundException.getCause(),
            HttpStatus.NOT_FOUND
        );

        return new ResponseEntity<>(familyDetailException, HttpStatus.NOT_FOUND);
    }
    
}
