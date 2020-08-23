package com.rewow.commons.domains.response.builder;



import com.rewow.commons.domains.response.BaseResponse;
import com.rewow.enums.TransactionState;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;

public class ResponseBuilder<T> {

    private T response;
    private HttpStatus httpStatus;
    private LocalDateTime timeResponse;
    private String path;
    private String message;
    private TransactionState state;
    HttpHeaders responseHeaders = new HttpHeaders();

    private ResponseBuilder() {
    }

    public static ResponseBuilder newBuilder() {
        return new ResponseBuilder();
    }

    public ResponseBuilder<T> withResponse(T response) {
        this.response = response;
        this.timeResponse = LocalDateTime.now();
        return this;
    }

    public ResponseBuilder<T> withPath(String path) {
        this.path = path;
        this.timeResponse = LocalDateTime.now();
        return this;
    }

    public ResponseBuilder<T> withStatus(HttpStatus status) {
        this.httpStatus = status;
        return this;
    }

    public ResponseBuilder<T> withMessage(String message) {
        this.message = message;
        this.timeResponse = LocalDateTime.now();
        return this;
    }

    public ResponseBuilder<T> withTransactionState(TransactionState state) {
        this.state = state;
        this.timeResponse = LocalDateTime.now();
        return this;
    }

    public ResponseBuilder<T> withHeader(String key, String value) {
        this.responseHeaders.set(key, value);
        this.timeResponse = LocalDateTime.now();
        return this;
    }

    public ResponseEntity<BaseResponse<T>> buildResponse() {
        BaseResponse<T> base = new BaseResponse<>(this.response, this.httpStatus, this.timeResponse, this.message,
                this.path, this.state);
        return ResponseEntity
                .status(this.httpStatus)
                .headers(this.responseHeaders)
                .body(base);

    }
}
