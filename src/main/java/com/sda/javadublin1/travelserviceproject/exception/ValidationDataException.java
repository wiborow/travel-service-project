package com.sda.javadublin1.travelserviceproject.exception;

// we can define our own exceptions for spring
// we will create other exceptions for any invalid HTTP code (> 400, <500)
// this will be responsible for code 400 - Bad Request
public class ValidationDataException extends RuntimeException {

    public ValidationDataException(String message) {
        super(message);
    }
}
