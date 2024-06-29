package com.example.springmvcapp.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    // HTTP Methods: GET; POST
    //  @GetMapping - GET, POST
    // @RequestMapping - GET
    //@PostMapping - POST

    // Display the initial HTML form
    @RequestMapping  ("/userInfo")
    public String display(){
        return "userform";
    }
    // Process the data from HTML form
    @RequestMapping("/processInfo")
    public String process(){

        return "processdata";
    }

    @RequestMapping("/form")
    public String processData(HttpServletRequest request, Model model){
        // read the request parameter from HTML form
        String name = request.getParameter("userName");

        // convert data
        name = name.toUpperCase();

        // store the results
        String result = "Hello! " + name;

        // add results back to the model

        model.addAttribute("greeting", result);

        return "processdata";

    }

    @PostMapping("/form2")
    public String processData(@RequestParam("userName") String name, Model model){

        // convert data
        name = name.toUpperCase();

        // store the results
        String result = "Hello there! " + name;

        // add results back to the model

        model.addAttribute("greeting", result);

        return "processdata";

    }


}
