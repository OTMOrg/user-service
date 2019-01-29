package com.standapp.api.userservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.standapp.api.userservice.models.entities.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(value="/user")
class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping(value="/")
    public User createUser(@RequestBody User user) {
        repository.save(user);
        return user;
    }

    @GetMapping(value="/{id}")
    public User findUserById(@PathVariable Long id) {
        return repository.findById(id).get();
    }
    
    

}