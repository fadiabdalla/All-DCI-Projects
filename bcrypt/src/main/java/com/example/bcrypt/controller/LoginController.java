package com.example.bcrypt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {


    @GetMapping("/login")
    public String login(){
        return "login-page";
    }


    @GetMapping("/unauthorized")
    public String unauthorized(){
        return "unauthorized";
    }

}
