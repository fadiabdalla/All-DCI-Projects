package com.exercise.xmlconfig;

public class GasService implements CarService{
    @Override
    public void startEngine(String start) {

        System.out.println("The Gas engine are " + start);
    }
}
