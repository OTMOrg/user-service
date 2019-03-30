package com.standapp.api.userservice.models.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "User")
public class User {

    @Column(name = "ID", nullable = false, length = 5)
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id;

    @Column(name = "Username")
    private String username;
    
    @Column(name = "Password")
    @NotBlank(message = "Password cannot be empty")
    private String password;
    
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<ContactDetails> contactDetails = new HashSet<>();

    public Set<ContactDetails> getContactDetails() {
        return this.contactDetails;
    }

    public void setContactDetails(Set<ContactDetails> contactDetails) {
        this.contactDetails = contactDetails;
    }

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

    public String getEmail() {
        for (ContactDetails c : contactDetails) {
            if(ContactDetails.ContactType.EMAIL.equals(c.getType())) {
                return c.getValue();
            }
        }
        return null;
    }
}