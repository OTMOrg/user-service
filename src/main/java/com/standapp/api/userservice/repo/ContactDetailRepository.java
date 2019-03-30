package com.standapp.api.userservice.repo;

import com.standapp.api.userservice.models.entities.ContactDetails;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactDetailRepository extends JpaRepository<ContactDetails, Long> {
    
}