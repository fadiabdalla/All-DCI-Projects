package com.example.springmvcform.controller;


import com.example.springmvcform.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/userForm")
    public String showForm(Model model){

        User theUser = new User();
        model.addAttribute("user", theUser);

        return "userform";
    }

    @PostMapping("/processInfo")
    public String process(@ModelAttribute("user") User user){
        System.out.println("user: " + user.getFullName() +
                " " + user.getGender() + " " + user.getAge() +
                " " + user.getMovie() + " " + user.getCinema());
        return "userconfirmation";

    }


}
