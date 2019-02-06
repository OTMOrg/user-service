package com.standapp.api.userservice.service;

import java.util.List;

import com.standapp.api.userservice.UserNotFoundException;
import com.standapp.api.userservice.models.dto.UserDTO;
import com.standapp.api.userservice.models.entities.User;
import com.standapp.api.userservice.repo.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDTO postUser(User user) {
        user = repository.save(user);
        return UserDTO.getUser(user);
    }

    @Override
    public UserDTO getUserById(Long id) {
        User user = repository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
        return UserDTO.getUser(user);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return null;
    }

    @Override
    public UserDTO putUser(Long id, User user) {
        return null;
    }

}