package com.exercise.xmlconfig.controller;

import com.exercise.xmlconfig.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CarProcessorImpl implements CarProcessor {


    private  CarService carService;


    public void setCarService(CarService carService) {
        this.carService = carService;
    }

    @Override
    public void processCar( ) {
        carService.startEngine();
    }

}