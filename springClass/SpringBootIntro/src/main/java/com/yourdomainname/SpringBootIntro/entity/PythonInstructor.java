package com.yourdomainname.SpringBootIntro.entity;

import org.springframework.stereotype.Component;

@Component
public class PythonInstructor implements Instructor {

    public PythonInstructor(){

        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    @Override
    public String getProgrammingExercise() {
        return "Calculate the area of a tringle.";
    }
}


