package com.standapp.api.userservice;

import com.standapp.api.userservice.models.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;

interface UserRepository extends JpaRepository<User, Long> {
}