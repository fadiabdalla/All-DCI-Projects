package com.yourdomainname.SpringBootIntro.entity;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class JavascriptInstructor implements Instructor{
    @Override
    public String getProgrammingExercise() {
        return "Write a program that multiplies two numbers.";
    }
}
