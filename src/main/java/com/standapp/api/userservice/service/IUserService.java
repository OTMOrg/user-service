package com.standapp.api.userservice.service;

import java.util.List;

import com.standapp.api.userservice.models.dto.UserDTO;
import com.standapp.api.userservice.models.entities.User;

public interface IUserService {

    UserDTO postUser(User user);

    UserDTO getUserById(Long id);

    List<UserDTO> getAllUsers();

    UserDTO putUser(Long id, User user);

	String deleteUser(Long id);

}