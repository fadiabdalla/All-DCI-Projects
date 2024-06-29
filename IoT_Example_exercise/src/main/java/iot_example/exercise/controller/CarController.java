package iot_example.exercise.controller;
import iot_example.exercise.entity;
import iot_example.exercise.entity.Engine;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class CarController {


    private final Engine engine;

    @Autowired
    public CarController(Engine myEngine){

        engine = myEngine;

    }

    @GetMapping("/start")
    public String start(){

        return engine.start();
    }

}
