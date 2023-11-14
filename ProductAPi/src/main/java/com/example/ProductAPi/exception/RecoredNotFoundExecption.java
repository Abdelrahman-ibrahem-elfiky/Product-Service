package com.example.ProductAPi.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class RecoredNotFoundExecption extends RuntimeException{
    public RecoredNotFoundExecption() {
    }

    public RecoredNotFoundExecption(String message) {
        super(message);
    }
}
