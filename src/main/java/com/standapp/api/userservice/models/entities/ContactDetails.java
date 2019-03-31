package com.standapp.api.userservice.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "ContactDetails")
public class ContactDetails {

    public enum ContactType {
        PHONE_NO, EMAIL
    }

    @Column(name = "ID", nullable = false, length = 10)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Type", nullable = false)
    private ContactType type;
    
    @Column(name = "Value", nullable = false)
    private String value;
    
    @Column(name = "Verified")
    private boolean verified;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User user;

    @JsonIgnore
    public User getUser() {
        return this.user;
    }

    @JsonIgnore
    public void setUser(User user) {
        this.user = user;
    }

    public ContactDetails() {
    }

    public ContactDetails(ContactType type, String value, boolean verified) {
        this.type = type;
        this.value = value;
        this.verified = verified;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public ContactType getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public boolean getVerified() {
        return this.verified;
    }

    public boolean isVerified() {
        return this.verified;
    }
    
}