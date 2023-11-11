package com.hla.in.homeloanapplication.entities;

import lombok.*;

import javax.persistence.Entity;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
//@EqualsAndHashCode(callSuper = true)
public class LandVerificationOfficer extends User{
    private String officerName;
    private String officerContact;

    public LandVerificationOfficer(int userId, String password, String role, String officerName, String officerContact) {
        super(userId, password, role);
        this.officerName = officerName;
        this.officerContact = officerContact;
    }

//    @Override
//    public String toString() {
//        return "LandVerificationOfficer{" +
//                "officerName='" + officerName + '\'' +
//                ", officerContact='" + officerContact + '\'' +
//                '}';
//    }
}

//Author : Anshul Gayakwad
