package com.standapp.api.userservice;

import com.standapp.api.userservice.common.RestResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class UserNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public RestResponse<String> userNotFoundHandler(UserNotFoundException ex) {
        return new RestResponse<String>(false, ex.getMessage(), ex.getLocalizedMessage());
    }

}