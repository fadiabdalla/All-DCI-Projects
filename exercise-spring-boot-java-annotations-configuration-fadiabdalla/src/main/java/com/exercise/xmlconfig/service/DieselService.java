package com.exercise.xmlconfig.service;

import org.springframework.stereotype.Component;

@Component
public class DieselService implements CarService{
    @Override
    public void startEngine( ) {

        System.out.println("The Benzine engine are Starting...");
    }
}
