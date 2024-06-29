package com.exercise.job.application.form.controller;

import com.exercise.job.application.form.model.Applicant;
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
public class ApplicantController {

    @InitBinder
    public void initBinder(WebDataBinder binder){
        StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class, trimmer);
    }

    @GetMapping("/job-form")
    public String display(Model model){
        model.addAttribute("applicant", new Applicant());
        return "application-form";
    }

    @PostMapping("/process")
    public String process(@Valid @ModelAttribute("applicant") Applicant applicant,
                          BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "application-form";
        } else {
            return "application-conf";
        }
    }
}
