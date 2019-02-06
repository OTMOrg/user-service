package com.standapp.api.userservice.common;

public class RestResponse<T> {

    private boolean status;

    private String message;

    private T data;

    public RestResponse(boolean status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public boolean getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public static <T> RestResponse<T> ok(T data) {
        return new RestResponse<T>(true, null, data);
    }

}