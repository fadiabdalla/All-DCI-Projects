package com.example.springmvcvalidation.controller;

import com.example.springmvcvalidation.model.Subscriber;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class SubscriberController {

    @InitBinder
    public void initBinder(WebDataBinder binder){
        StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class,trimmer);
    }

    @GetMapping("/form")
    public String display(Model model){
        model.addAttribute("subscriber", new Subscriber());

        return "subscriber-form";

    }

    @PostMapping("/process")
    public String process(@Valid @ModelAttribute("subscriber") Subscriber subscriber,
                          BindingResult bindingResult){

        System.out.println("Address: -" + subscriber.getAddress() + "-" );
        if(bindingResult.hasErrors()){
            return "subscriber-form";

        }else {

            return "subscriber-conf";
        }



    }

}
