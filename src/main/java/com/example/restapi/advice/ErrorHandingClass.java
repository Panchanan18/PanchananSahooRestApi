package com.example.restapi.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ErrorHandingClass {
     @ResponseStatus(HttpStatus.BAD_REQUEST)
     @ExceptionHandler(Exception.class)
    public Map<String,String> handlingException(Exception e){
         Map<String,String> errorMap=new HashMap<>();
         errorMap.put("message",e.getMessage());
         errorMap.put("Status","BAD_REQUEST");
         return errorMap;
     }

}
