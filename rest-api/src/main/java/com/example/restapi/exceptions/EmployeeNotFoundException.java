package com.example.restapi.exceptions;

public class EmployeeNotFoundException extends RuntimeException{ // Custom exception class

    public EmployeeNotFoundException(String message){
        super(message);


    }

}
