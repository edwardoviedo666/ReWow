package com.rewow.commons.domains.response;

import com.rewow.enums.TransactionState;
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
    private TransactionState transactionState;

    public BaseResponse(T body, HttpStatus status, LocalDateTime timeResponse, String message, String path, TransactionState transactionState) {
        this.body = body;
        this.status = status;
        this.timeResponse = timeResponse;
        this.message = message;
        this.path = path;
        this.transactionState = transactionState;
    }
    public BaseResponse(T response, HttpStatus httpStatus, LocalDateTime timeResponse, String message, TransactionState state) {
        this.body = response;
        this.status = httpStatus;
        this.timeResponse = timeResponse;
        this.message = message;
        this.transactionState = state;
    }


}
