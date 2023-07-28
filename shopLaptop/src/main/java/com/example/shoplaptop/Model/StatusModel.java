package com.example.shoplaptop.Model;

import org.springframework.http.HttpStatus;

public class StatusModel<T> {
    private String message;
    private HttpStatus status;
    private T data;
    public StatusModel(){};

    public StatusModel(String message, HttpStatus status, T data) {
        this.message = message;
        this.status = status;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
