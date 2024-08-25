package com.example.SpringBootAssigment.Exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalStateException.class)
    public String handle(IllegalStateException exception){
        return exception.getMessage() + " Custom handle";
    }

    @ExceptionHandler(RuntimeException.class)
    public String handle(RuntimeException exception){
        return exception.getMessage() + " Runtime handle";
    }

}
