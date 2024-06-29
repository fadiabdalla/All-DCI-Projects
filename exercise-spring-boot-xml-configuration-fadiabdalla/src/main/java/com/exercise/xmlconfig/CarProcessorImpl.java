package com.exercise.xmlconfig;

public class CarProcessorImpl implements CarProcessor{


    private CarService carService;


    public void setCarService( CarService cs){


        carService=cs;
    }
    @Override
    public void processCar(String start) {

        carService.startEngine(start);

    }
}
