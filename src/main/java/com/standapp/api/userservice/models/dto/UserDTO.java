package com.standapp.api.userservice.models.dto;

import com.standapp.api.userservice.models.entities.User;
import com.standapp.api.userservice.models.entities.User.ContactDetails;

public class UserDTO {

    private Long id;
    private String username;
    private String email;
    private String phoneNumber;
    private ContactDetails extraContactDetails;

    public static UserDTO getUser(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.id = user.getId();
        userDTO.email = user.getEmail();
        userDTO.phoneNumber = user.getPhoneNumber();
        userDTO.extraContactDetails = user.getExtraContactDetails();
        return userDTO;
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

    public ContactDetails getExtraContactDetails() {
        return this.extraContactDetails;
    }

    public void setExtraContactDetails(ContactDetails extraContactDetails) {
        this.extraContactDetails = extraContactDetails;
    }
    

}