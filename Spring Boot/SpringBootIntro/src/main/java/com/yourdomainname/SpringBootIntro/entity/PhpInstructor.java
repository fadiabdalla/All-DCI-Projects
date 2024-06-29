package com.yourdomainname.SpringBootIntro.entity;


import org.springframework.stereotype.Component;

@Component
public class PhpInstructor implements Instructor {


    @Override
    public String getProgrammingExercise() {
        return "Write a program to display count from 5 to 15.";
    }
}
