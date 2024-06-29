package com.schoolmanagement.school.school.entity;

import org.springframework.stereotype.Component;

@Component
public class FirstStudent implements Student{

    private String firstName = "Fadi";
    private String lastName = "Georgos Abdallah";
    private String address = "Niedersachsendamm 12, 28201 Bremen";
    private String email = "fadiabdalla99@gmail.com";
    private int score = 97;


    @Override
    public String getFirstName() {
        return "First name: " + firstName;
    }

    @Override
    public String getlastName() {
        return "Last name: " + lastName;
    }

    @Override
    public String getAddress() {
        return "Address: " + address;
    }

    @Override
    public String getEmail() {
        return "Email: " + email;
    }

    @Override
    public String getScore() {
        return "The score is : " + score + "%";
    }
}
