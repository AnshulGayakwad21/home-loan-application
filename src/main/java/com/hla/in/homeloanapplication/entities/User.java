package com.hla.in.homeloanapplication.entities;

import javax.persistence.*;

@Entity
@Table(name = "loan_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String password;
    private String role;

    public User() {
    }

    public User(int userId, String password, String role) {
        this.userId = userId;
        this.password = password;
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}

//Author : Anshul gayakwad