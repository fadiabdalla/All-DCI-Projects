package com.example.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping ("/register")
    public String register(){
        return "register";
    }
    @GetMapping ("/information")
    public String displayInfo(){
        return "info";
    }
    @GetMapping ("/index")
    public String index(){
        return "homepage";
    }

    @GetMapping ("/login")
    public String login(){
        return "login";
    }

}
