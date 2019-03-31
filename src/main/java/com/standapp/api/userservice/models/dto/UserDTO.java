package com.standapp.api.userservice.models.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.standapp.api.userservice.models.entities.ContactDetails;
import com.standapp.api.userservice.models.entities.User;


public class UserDTO {

    private Long id;
    private String username;
    private Set<ContactDetails> contactDetails;

    public Set<ContactDetails> getContactDetails() {
        return this.contactDetails;
    }

    public void setContactDetails(Set<ContactDetails> contactDetails) {
        this.contactDetails = contactDetails;
    }

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

    public static UserDTO getUser(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.id = user.getId();
        userDTO.contactDetails = user.getContactDetails();
        userDTO.username = user.getUsername();
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