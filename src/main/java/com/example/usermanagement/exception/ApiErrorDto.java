package com.example.usermanagement.exception;


import java.time.LocalDateTime;

public class ApiErrorDto {
    private int status;
    private String message;
    private LocalDateTime timestamp;
    
    public ApiErrorDto(int status, String message, LocalDateTime timestamp) {
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }
    public int getStatus(){
        return status;

    }
    public String getMessage(){
        return message;

    }
    public LocalDateTime getTimestamp(){
        return timestamp;
    }

}
