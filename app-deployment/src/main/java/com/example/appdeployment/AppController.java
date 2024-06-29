package com.example.appdeployment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/home")
    public String home() {
        return "Congrats! You have successfully deployed this app in AWS.";
    }

    @GetMapping("/aboutus")
    public String aboutus() {
        return "this is about us page.";
    }
}
