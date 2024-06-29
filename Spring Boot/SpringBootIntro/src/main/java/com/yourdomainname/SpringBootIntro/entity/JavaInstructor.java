package com.yourdomainname.SpringBootIntro.entity;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


// @Component makes this class available for component scanning
@Component

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class JavaInstructor implements Instructor {
    @Override
    public String getProgrammingExercise() {
        return "Write a method that sums up two numbers";
    }
}
