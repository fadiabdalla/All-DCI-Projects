package com.example.bcrypt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @GetMapping("/")
    public String home(){

        return "home";
    }

    @GetMapping("/supervisors")
    public String supervisors(){

        return "supervisors";
    }
    @GetMapping("/admin")
    public String admin(){

        return "admin";
    }

}
