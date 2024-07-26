package com.volley.exceptions;

public class NotFoundException extends RuntimeException {

    private static final String NOT_FOUND_MESSAGE = "Not Found!";

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException() {
        super(NOT_FOUND_MESSAGE);
    }
}
