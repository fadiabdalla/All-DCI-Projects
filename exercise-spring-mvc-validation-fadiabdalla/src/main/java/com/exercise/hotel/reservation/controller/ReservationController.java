package com.exercise.hotel.reservation.controller;

import com.exercise.hotel.reservation.model.Reservation;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ReservationController {

    @GetMapping("/reservation")
    public String display (Model model){
        model.addAttribute("reservation",new Reservation());

        return "reservation-form";

    }

    @PostMapping("/guest-info")
    public String book (@Valid @ModelAttribute("reservation") Reservation reservation,
                        BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "reservation-form";
        }else{

            return "reservation-conf";
        }

    }

}
