package com.standapp.api.userservice.models.domain;

import com.standapp.api.userservice.models.entities.User.ContactDetails;

public class User {

    private Long id;
    private String username;
    private String email;
    private String phoneNumber;
    private ContactDetails extraContactDetails;

}