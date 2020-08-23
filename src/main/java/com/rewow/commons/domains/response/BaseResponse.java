package com.soaint.fogacoop.commons.domains.response;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class BaseResponse<T> implements Serializable {

    private T body;
    private HttpStatus status;
    private LocalDateTime timeResponse;
    private String message;
    private String path;

    public BaseResponse(T body, HttpStatus status, LocalDateTime timeResponse, String message, String path) {
        this.body = body;
        this.status = status;
        this.timeResponse = timeResponse;
        this.message = message;
        this.path = path;
    }


}
