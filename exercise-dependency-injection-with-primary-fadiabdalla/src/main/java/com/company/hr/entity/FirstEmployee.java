package com.company.hr.entity;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FirstEmployee implements Employee{

    private String firstName = "Fadi";
    private String lastName = "Georgos Abdallah";
    private String department = "IT";
    private String email = "fadiabdalla99@gmail.com";
    private String promotion = "1";


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


