package com.example.ProductAPi.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice

public class DuplicateRecord extends RuntimeException {
    public DuplicateRecord() {
    }

    public DuplicateRecord(String message) {
        super(message);
    }
}
