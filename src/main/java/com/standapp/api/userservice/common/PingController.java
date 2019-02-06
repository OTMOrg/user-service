package com.standapp.api.userservice.common;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/ping")
class PingController {

    @GetMapping(value = "/")
    public RestResponse<Payload> ping() {
        return RestResponse.ok(new Payload("Hi"));
    }

    @GetMapping(value = "/db")
    public RestResponse<Payload> pingDB() {
        return RestResponse.ok(new Payload("TODO"));
        //TODO ping actual db with a light weight query
    }

}