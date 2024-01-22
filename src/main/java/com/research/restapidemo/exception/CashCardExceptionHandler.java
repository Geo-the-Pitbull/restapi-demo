package com.research.restapidemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CashCardExceptionHandler {
    
    @ExceptionHandler(value = {CashCardNotFoundException.class})
    public ResponseEntity<Object> handleCashCardNotFoundException(CashCardNotFoundException cashCardNotFoundException) {
        CashCardException cashCardException = new CashCardException(
            cashCardNotFoundException.getMessage(),
            cashCardNotFoundException.getCause(),
            HttpStatus.NOT_FOUND
        );

        return new ResponseEntity<>(cashCardException, HttpStatus.NOT_FOUND);
    }
}
