package com.standapp.api.userservice.models.dto;

import java.util.ArrayList;
import java.util.List;

import com.standapp.api.userservice.models.entities.User;


public class UserDTO {

    private Long id;
    private String username;
    private String email;
    private String phoneNumber;


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static UserDTO getUser(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.id = user.getId();
        userDTO.email = user.getEmail();
        userDTO.username = user.getUsername();
        // userDTO.phoneNumber = user.getPhoneNumber();
        // userDTO.extraContactDetails = user.getExtraContactDetails();
        return userDTO;
    }

	public static List<UserDTO> getUsers(List<User> users) {
        int size = users.size();
        List<UserDTO> userDTOs = new ArrayList<UserDTO>(size);
        for (int i = 0; i < size; i++) {
            userDTOs.add(getUser(users.get(i)));
        }
		return userDTOs;
	}
    

}