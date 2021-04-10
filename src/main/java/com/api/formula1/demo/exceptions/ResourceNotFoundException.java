package com.api.formula1.demo.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message) {
        super("Error from application " + message);
    }
}
