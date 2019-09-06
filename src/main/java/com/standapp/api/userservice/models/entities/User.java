package com.standapp.api.userservice.models.entities;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "User")
public class User {

    @Column(name = "ID", nullable = false, length = 5)
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id;

    @Column(name = "Username", nullable = false)
    private String username;
    
    @Column(name = "Password", nullable = false)
    @NotBlank(message = "Password cannot be empty")
    private String password;

    @Column(name = "CreatedOn")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date createdOn = new Date();

    @Column(name = "UpdatedOn")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Date updatedOn = new Date();

    @Column(name = "Status")
//    @Enumerated =? todo
    private Status status = Status.ACTIVE;

    public enum Status {
        ACTIVE, ENABLED, DELETED, BANNED
    }

    //Empty constructor is needed by spring to create a new user instance
    public User() {
    }

    public User(String username, String password) {
        this.username = username;
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

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public Status getStatus() {
        return status;
    }
}