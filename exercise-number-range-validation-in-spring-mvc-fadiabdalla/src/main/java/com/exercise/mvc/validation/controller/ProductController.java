package com.exercise.mvc.validation.controller;

import com.exercise.mvc.validation.model.Product;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    @GetMapping("/products")
    public String display (Model model){

        model.addAttribute("product", new Product());

        return "add";
    }

    @PostMapping("/add-product")
    public String addProduct(@Valid @ModelAttribute("product") Product product,
                             BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "add";
        }else{

            return "productconf";
        }

    }


}
