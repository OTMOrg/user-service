package com.standapp.api.userservice.models.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ContactDetail {

    public enum ContactType {
        PHONE_NO, EMAIL
    }

    private @Id @GeneratedValue Long id;
    private ContactType type;
    private String value;
    private boolean verified;

    public ContactDetail() {
    }

    public ContactDetail(ContactType type, String value, boolean verified) {
        this.type = type;
        this.value = value;
        this.verified = verified;
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