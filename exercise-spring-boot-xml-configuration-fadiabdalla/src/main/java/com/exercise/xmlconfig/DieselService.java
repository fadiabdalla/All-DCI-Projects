package com.exercise.xmlconfig;

public class DieselService implements CarService{
    @Override
    public void startEngine(String start) {

        System.out.println("The Diesel engine are " + start);
    }
}
