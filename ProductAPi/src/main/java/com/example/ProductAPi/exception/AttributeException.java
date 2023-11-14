package com.example.ProductAPi.exception;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
public class AttributeException {

    private String message;
    private List<String>details;
    private Boolean success;

    public AttributeException() {
    }

    public AttributeException(String message, List<String> details) {
        this.message = message;
        this.details = details;
        this.success=Boolean.FALSE;
    }
}
