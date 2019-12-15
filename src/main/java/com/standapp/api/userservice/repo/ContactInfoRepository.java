package com.standapp.api.userservice.repo;

import com.standapp.api.userservice.models.entities.ContactInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactInfoRepository extends JpaRepository<ContactInfo, Long> {
}
