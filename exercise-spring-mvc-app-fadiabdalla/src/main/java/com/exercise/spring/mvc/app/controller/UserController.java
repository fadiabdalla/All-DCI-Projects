package com.exercise.spring.mvc.app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/home")
     public String homePage(){
        return "contact";
    }

    @RequestMapping ("/processMessage")
    public void processMessage(){

    }
}
