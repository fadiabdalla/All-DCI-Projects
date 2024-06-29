package com.yourdomainname.SpringBootIntro.entity;


import org.springframework.context.annotation.Bean;

// Not using @Component on purpose
public class CInstructor implements Instructor {


    public CInstructor(){

        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getProgrammingExercise() {
        return "Write a program to convert temperature in Fahrenheit to Celsius";
    }
}
