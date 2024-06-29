package com.exercise.xmlconfig;

public class BenzineService implements CarService{
    @Override
    public void startEngine(String start) {

        System.out.println("The Benzine engine are " + start);
    }
}
