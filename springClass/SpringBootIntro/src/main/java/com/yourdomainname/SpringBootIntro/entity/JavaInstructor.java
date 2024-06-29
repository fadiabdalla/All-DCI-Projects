package com.yourdomainname.SpringBootIntro.entity;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


// @Component makes this class available for component scanning
@Component

//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class JavaInstructor implements Instructor {


    public JavaInstructor(){

        System.out.println("In constructor: " + getClass().getSimpleName());
    }


    // Bean Lifecycle Methods :
    @PostConstruct // Any method that is annotated with @PostConstruct is excuted when the bean is initialized
    public void initCode(){

        System.out.println("In initCode(): " + getClass().getSimpleName());
    }


    // For ProtoType scoped beans, spring does not call the destroy methods.
    // In contrast to the other scopes, Spring does not manage the complete lifecycle of a prototype bean.
    @PreDestroy // Any method that is annotated with @ PreDestroy is excuted when the application stops running
    public void cleanUpCode(){

        System.out.println("In cleanUpCode(): " + getClass().getSimpleName());
    }
    @Override
    public String getProgrammingExercise() {
        return "Write a method that sums up two numbers";
    }
}
