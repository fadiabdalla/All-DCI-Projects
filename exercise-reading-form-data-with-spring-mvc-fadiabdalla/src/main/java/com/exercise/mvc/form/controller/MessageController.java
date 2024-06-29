package com.exercise.mvc.form.controller;

import com.exercise.mvc.form.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MessageController {

    @GetMapping("/contactUS")
    public String contactUS (Model model){

        Message message = new Message();
        model.addAttribute("msg", message);



        return "contactform";}


    @PostMapping("/send")
    public String sendMessage (@ModelAttribute("message") Message message){

        return "messagerecieved";
    }

}
