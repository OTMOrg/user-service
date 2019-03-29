package com.standapp.api.userservice.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

    private @Id @GeneratedValue Long id;
    private String username;
    private String email;
    private String password;
    private String phoneNumber;
    private ContactDetails extraContactDetails;

    public User() {
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
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

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    //TODO contact details to be an entity having type value and verified. Have a one to many mapping of user to contact details, one to many annotation fetch type (eager, lazy)
    //Why below annotaion? -> https://stackoverflow.com/a/4381360/4291698
    @Embeddable
    //Why static? -> https://stackoverflow.com/a/46911039/4291698
    public static class ContactDetails {
        //Why below annotation? -> https://stackoverflow.com/a/15935216/4291698
        @ElementCollection(targetClass=String.class)
        private List<String> phoneNumbers;
        
        @ElementCollection(targetClass=String.class)
        private List<String> emails;

        public ContactDetails() {

        }

        public List<String> getPhoneNumbers() {
            return phoneNumbers;
        }
        
        public List<String> getEmails() {
            return emails;
        }

        public void setPhoneNumbers(List<String> phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
        }

        public void setEmails(List<String> emails) {
            this.emails = emails;
        }

        public void addPhoneNumber(String phoneNumber) {
            if (phoneNumbers == null) {
                phoneNumbers = new ArrayList<>();
            }
            phoneNumbers.add(phoneNumber);
        }

        public void addEmail(String email) {
            if (emails == null) {
                emails = new ArrayList<>();
            }
            emails.add(email);
        }

    }

}