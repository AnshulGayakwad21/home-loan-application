package com.hla.in.homeloanapplication.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Admin extends User{
    private String adminName;
    private String adminContact;

    public Admin(int userId, String password, String role, String adminName, String adminContact) {
        super(userId, password, role);
        this.adminName = adminName;
        this.adminContact = adminContact;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminContact() {
        return adminContact;
    }

    public void setAdminContact(String adminContact) {
        this.adminContact = adminContact;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminName='" + adminName + '\'' +
                ", adminContact='" + adminContact + '\'' +
                '}';
    }
}

//Author : Anshul Gayakwad
