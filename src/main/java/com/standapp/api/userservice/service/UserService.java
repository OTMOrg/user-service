package com.standapp.api.userservice.service;

import java.util.List;

import com.standapp.api.userservice.UserNotFoundException;
import com.standapp.api.userservice.models.dto.UserDTO;
import com.standapp.api.userservice.models.entities.ContactDetails;
import com.standapp.api.userservice.models.entities.User;
import com.standapp.api.userservice.repo.ContactDetailRepository;
import com.standapp.api.userservice.repo.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ContactDetailRepository contactsRepository;

    @Override
    public UserDTO postUser(User user) {
        user = userRepository.save(user);
        for (ContactDetails c : user.getContactDetails()) {
            c.setUser(user);
            ContactDetails cd = contactsRepository.save(c);
            c.setId(cd.getId());
        }
        return UserDTO.getUser(user);
    }

    @Override
    public UserDTO getUserById(Long id) {
        User user = userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
        return UserDTO.getUser(user);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> users = userRepository.findAll();
        return UserDTO.getUsers(users);
    }

    @Override
    public UserDTO putUser(Long id, User newUser) {
        User updatedUser = userRepository.findById(id).map(user -> {
            user.setPassword(newUser.getPassword());
            user.setUsername(newUser.getUsername());
            user.setContactDetails(newUser.getContactDetails());
            return userRepository.save(user);
        }).get();
        return UserDTO.getUser(updatedUser);
    }

    //TODO do a soft delete
    @Override
    public String deleteUser(Long id) {
        //Ask rohan if I should use the commented code, shouldn't I tell user if the entry he is trying to delete does not exist?
        // if (repository.existsById(id)) {
        // repository.deleteById(id);
        // if (!repository.existsById(id)) {
        // return "User with id: " + id + "deleted";
        // } else {
        // //Some issue while deleting user, maybe throw an error status code
        // }
        // }
        // throw new UserNotFoundException(id);
        userRepository.deleteById(id);
        return "User with id: " + id + " deleted";
    }

}