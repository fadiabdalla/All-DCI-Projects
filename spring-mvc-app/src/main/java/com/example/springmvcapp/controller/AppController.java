package com.example.springmvcapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


@Controller
public class AppController {

    @GetMapping("/hello")

    public String sayHello(Model model){

        model.addAttribute("date", new java.util.Date());
        return "helloworld";
    }


}
