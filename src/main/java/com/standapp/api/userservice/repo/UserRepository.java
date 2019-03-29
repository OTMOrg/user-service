package com.standapp.api.userservice.repo;

import com.standapp.api.userservice.models.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
}