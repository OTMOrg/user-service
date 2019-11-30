package com.standapp.api.userservice;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.standapp.api.userservice.common.RestResponse;
import com.standapp.api.userservice.models.dto.UserDTO;
import com.standapp.api.userservice.models.entities.User;
import com.standapp.api.userservice.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Post methods to be prefixed with post
 * Get methods to be prefixed with get
 * Put methods to be prefixed with put
 * Delete methods to be prefixed with delete
 * This terminology to be used throughout the service
 */

@RestController
@RequestMapping(value = "/user")
class UserController {

    @Autowired
    private IUserService userService;

    //    @PostMapping(value="")
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.HEAD}, value = "")
    public RestResponse<UserDTO> postUser(@RequestBody User user) {
        return RestResponse.ok(userService.postUser(user));
    }

    //    @GetMapping(value="/{id}")
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD}, value = "/{id}")
    public RestResponse<UserDTO> getUserById(@PathVariable Long id) {
        return RestResponse.ok(userService.getUserById(id));
    }

    //    @GetMapping(value="")
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD}, value = "")
    public RestResponse<List<UserDTO>> getAllUsers() {
        return RestResponse.ok(userService.getAllUsers());
    }

    //    @PutMapping(value = "/{id}")
    @RequestMapping(method = {RequestMethod.PUT, RequestMethod.HEAD}, value = "/{id}")
    public RestResponse<UserDTO> putUser(@PathVariable("id") Long id, @RequestBody User user) {
        return RestResponse.ok(userService.putUser(id, user));
    }

    // TODO: 2019-10-15 Handle case where we are trying to delete an already existing user
    //    @DeleteMapping(value = "/{id}")
    @RequestMapping(method = {RequestMethod.DELETE, RequestMethod.HEAD}, value = "/{id}")
    public RestResponse<String> deleteUser(@PathVariable("id") Long id) {
        return RestResponse.ok(userService.deleteUser(id));
    }

}