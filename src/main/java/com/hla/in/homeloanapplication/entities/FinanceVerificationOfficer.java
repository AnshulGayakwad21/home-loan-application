package com.hla.in.homeloanapplication.entities;

import lombok.EqualsAndHashCode;
import javax.persistence.Entity;

@Entity
//@EqualsAndHashCode(callSuper = true)
public class FinanceVerificationOfficer extends User{
    private String finOfficerName;
    private String finOfficerContact;

    public FinanceVerificationOfficer(String finOfficerName, String finOfficerContact) {
        this.finOfficerName = finOfficerName;
        this.finOfficerContact = finOfficerContact;
    }

    public FinanceVerificationOfficer(int userId, String password, String role, String finOfficerName, String finOfficerContact) {
        super(userId, password, role);
        this.finOfficerName = finOfficerName;
        this.finOfficerContact = finOfficerContact;
    }

    public String getFinOfficerName() {
        return finOfficerName;
    }

    public void setFinOfficerName(String finOfficerName) {
        this.finOfficerName = finOfficerName;
    }

    public String getFinOfficerContact() {
        return finOfficerContact;
    }

    public void setFinOfficerContact(String finOfficerContact) {
        this.finOfficerContact = finOfficerContact;
    }

    @Override
    public String toString() {
        return "FinanceVerificationOfficer{" +
                "finOfficerName='" + finOfficerName + '\'' +
                ", finOfficerContact='" + finOfficerContact + '\'' +
                '}';
    }
}

//Author : Anshul Gayakwad