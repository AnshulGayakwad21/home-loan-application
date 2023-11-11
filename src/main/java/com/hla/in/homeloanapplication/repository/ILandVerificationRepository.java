package com.hla.in.homeloanapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hla.in.homeloanapplication.entities.LandVerificationOfficer;
@Repository
public interface ILandVerificationRepository extends JpaRepository<LandVerificationOfficer, Integer>{
    LandVerificationOfficer findByOfficerName(String officeName);

    LandVerificationOfficer findByOfficerContact(String officeContact);
}
