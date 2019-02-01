package com.standapp.api.userservice.models.domain;

import com.standapp.api.userservice.models.entities.User.ContactDetails;

public class User {

    private Long id;
    private String username;
    private String email;
    private String phoneNumber;
    private ContactDetails extraContactDetails;

    public static User getUser(com.standapp.api.userservice.models.entities.User userEntity) {
        User user = new User();
        user.id = userEntity.getId();
        user.email = userEntity.getEmail();
        user.phoneNumber = userEntity.getPhoneNumber();
        user.extraContactDetails = userEntity.getExtraContactDetails();
        return user;
    }

}