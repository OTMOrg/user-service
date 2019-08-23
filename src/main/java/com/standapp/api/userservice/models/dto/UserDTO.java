package com.standapp.api.userservice.models.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.standapp.api.userservice.models.entities.User;
import com.standapp.api.userservice.utils.DateUtils;


public class UserDTO {

    private Long id;
    private String username;
    private String createdOn;
    private String updatedOn;
    private String status;

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

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(String updatedOn) {
        this.updatedOn = updatedOn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static UserDTO getUser(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.id = user.getId();
        userDTO.username = user.getUsername();
        userDTO.createdOn = DateUtils.getDateString(user.getCreatedOn(), DateUtils.STANDARD_DATE_FORMAT);
        userDTO.updatedOn = DateUtils.getDateString(user.getCreatedOn(), DateUtils.STANDARD_DATE_FORMAT);
        userDTO.status = user.getStatus().name();
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