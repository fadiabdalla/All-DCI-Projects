package com.sport.scores.scores.controller;

import com.sport.scores.scores.entity.Sport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SportAppController {

    @Autowired
    Sport sport;


    @GetMapping("/basketball")
    public String scores(){

        return sport.getScores();
    }
}
