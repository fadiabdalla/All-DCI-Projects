package com.example.restapi.controller;

import com.example.restapi.entity.Employee;
import com.example.restapi.exceptions.EmployeeExceptions;
import com.example.restapi.exceptions.EmployeeNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

   private List<Employee> employees ;

   @PostConstruct // This annotation serves as an alternative to a constructor.
   // The PostConstruct annotation is used on a method that needs to be executed after dependency injection.
   public void addData (){

       employees = new ArrayList<>();

       employees.add(new Employee("Fadi","Abdallah"));
       employees.add(new Employee("Sam","Smith"));
       employees.add(new Employee("Sarah","Jones"));



   }

    @GetMapping("/employees") // to access this endpoint we need to search for localhost:8080/api/employees
    public List<Employee> getEmployees(){





        return employees;
    }


    @GetMapping("/employees/{employeeId}")
    public Employee getEmpolyeeById (@PathVariable int employeeId){


       if((employeeId>= employees.size()) || (employeeId < 0)){

           throw new EmployeeNotFoundException("Employee id not found " + employeeId);
       }


       return employees.get(employeeId);

    }


    @ExceptionHandler
    public ResponseEntity<EmployeeExceptions> handleException(EmployeeNotFoundException e){

       EmployeeExceptions exception = new EmployeeExceptions();
       exception.setStatus(HttpStatus.NOT_FOUND.value());
       exception.setMessage(e.getMessage());
       exception.setTimeStamp(System.currentTimeMillis());

       return new ResponseEntity<>(exception, HttpStatus.NOT_FOUND);

    }

    @ExceptionHandler
    public ResponseEntity<EmployeeExceptions> handleExceptions(Exception e){

        EmployeeExceptions exception = new EmployeeExceptions();
        exception.setStatus(HttpStatus.BAD_REQUEST.value());
        exception.setMessage(e.getMessage());
        exception.setTimeStamp(System.currentTimeMillis());

        return new ResponseEntity<>(exception, HttpStatus.BAD_REQUEST);

    }



}
