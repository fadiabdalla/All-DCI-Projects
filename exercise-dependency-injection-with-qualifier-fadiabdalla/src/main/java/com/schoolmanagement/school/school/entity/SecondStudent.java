package com.schoolmanagement.school.school.entity;

import org.springframework.stereotype.Component;

@Component
public class SecondStudent implements Student{
    private String firstName = "Sandy";
    private String lastName = "Kassab";
    private String address = "Seelbuschring 8, 12105 Berlin";
    private String email = "sandykassab@gmail.com";
    private int score = 83;


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
