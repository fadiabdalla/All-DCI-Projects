package com.company.hr.entity;

import org.springframework.stereotype.Component;

@Component
public class SecondEmployee implements Employee{

    private String firstName = "Sandy";
    private String lastName = "Kassab";
    private String department = "Finance";
    private String email = "sandykkassab@gmail.com";
    private String promotion = "3";


    @Override
    public String getFirstName() {
        return "First name: " + firstName;
    }

    @Override
    public String getlastName() {
        return "Last name: " + lastName;
    }

    @Override
    public String getDepartment() {
        return "department: " + department;
    }

    @Override
    public String getEmail() {
        return "Email: " + email;
    }

    @Override
    public String getPromotion() {
        return "The Promotion is : " + promotion;
    }
}


