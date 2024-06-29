package com.exercise.xmlconfig.controller;

import com.exercise.xmlconfig.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class CarController {

    private CarService cs;

@Autowired
    public CarController(@Qualifier("benzineService") CarService cs) {
        this.cs = cs;
        this.cs.startEngine();
    }



}
