package IoT_example.exercise.controller;

import IoT_example.exercise.entity.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {


    private  Engine engine;

    @Autowired
    public CarController(Engine myEngine){

        engine = myEngine;

    }

    @GetMapping("/start")
    public String start(){

        return engine.start();
    }

}