package com.example.ProductAPi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.net.http.HttpHeaders;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ControllerAdvice
public class GlobalExecptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(RecoredNotFoundExecption.class)
    public ResponseEntity<?> handleRecoredNotFound(RecoredNotFoundExecption ex){

        AttributeException exception = new AttributeException(ex.getLocalizedMessage(), Arrays.asList(ex.getMessage()));

        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(exception);
    }


    @ExceptionHandler(DuplicateRecord.class)
    public ResponseEntity<?> handleDuplicateRecord(DuplicateRecord ex){

        AttributeException exception = new AttributeException(ex.getLocalizedMessage(), Arrays.asList(ex.getMessage()));

        return ResponseEntity
                .status(HttpStatus.CONFLICT)
                .body(exception);
    }


    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers, HttpStatus status, WebRequest request) {

        List<String> errors = new ArrayList<String>();

        for (FieldError error : ex.getBindingResult().getFieldErrors()) {
            errors.add(error.getDefaultMessage());
        }
        for (ObjectError error : ex.getBindingResult().getGlobalErrors()) {
            errors.add(error.getDefaultMessage());
        }

        AttributeException exception = new AttributeException(ex.toString(), errors);

        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(exception);
    }



}
