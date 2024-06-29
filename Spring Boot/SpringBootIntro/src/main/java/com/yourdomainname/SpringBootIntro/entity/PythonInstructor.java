package com.yourdomainname.SpringBootIntro.entity;

import org.springframework.stereotype.Component;

@Component
public class PythonInstructor implements Instructor {
    @Override
    public String getProgrammingExercise() {
        return "Calculate the area of a tringle.";
    }
}


