package com.hla.in.homeloanapplication.entities;

import lombok.*;

import javax.persistence.Entity;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
//@EqualsAndHashCode(callSuper = true)
public class FinanceVerificationOfficer extends User{
    private String finOfficerName;
    private String finOfficerContact;

//    public FinanceVerificationOfficer(String finOfficerName, String finOfficerContact) {
//        this.finOfficerName = finOfficerName;
//        this.finOfficerContact = finOfficerContact;
//    }

//    public FinanceVerificationOfficer(int userId, String password, String role, String finOfficerName, String finOfficerContact) {
//        super(userId, password, role);
//        this.finOfficerName = finOfficerName;
//        this.finOfficerContact = finOfficerContact;
//    }

//    @Override
//    public String toString() {
//        return "FinanceVerificationOfficer{" +
//                "finOfficerName='" + finOfficerName + '\'' +
//                ", finOfficerContact='" + finOfficerContact + '\'' +
//                '}';
//    }
}