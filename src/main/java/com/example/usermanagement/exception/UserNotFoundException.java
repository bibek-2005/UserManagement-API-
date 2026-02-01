package com.example.usermanagement.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.usermanagement.exception.UserNotFoundException;
@ResponseStatus(HttpStatus.NOT_FOUND)



public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(Long id){
        super("User not found with ID: " + id);
    }
    
}
