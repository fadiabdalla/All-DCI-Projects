package com.yourdomainname.SpringBootIntro.entity;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy // Bean is only initialized if needed for dependency injection
public class PhpInstructor implements Instructor {


    public PhpInstructor(){

        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getProgrammingExercise() {
        return "Write a program to display count from 5 to 15.";
    }
}
