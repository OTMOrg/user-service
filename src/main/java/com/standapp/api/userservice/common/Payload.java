package com.standapp.api.userservice.common;

public class Payload {

    private String message;
    private long timestamp;

    public Payload(String message) {
        this.message = message;
        this.timestamp = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "Hello";
    }

    public String getMessage() {
        return message;
    }

    public long getTimestamp() {
        return timestamp;
    }

}