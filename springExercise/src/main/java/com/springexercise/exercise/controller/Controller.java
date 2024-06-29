package com.springexercise.exercise.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @GetMapping("/test")
    public String testMethod() {
        return "test method excuted!";

        //http://localhost:7575/test
    }

    @GetMapping(path = "/print-name")
    public String printName() {

        return "Fadi Georgos Abdallah";

        //http://localhost:7575/print-name

    }

    @GetMapping("/print")
    public String testMethod(@RequestParam String name) {
        return "my name : " + name;

        //http://localhost:7575/print?name=Fadi
    }
}
