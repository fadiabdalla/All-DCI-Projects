package com.company.hr.controller;

import com.company.hr.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeesController {

    Employee employee;


    @Autowired
    public EmployeesController(Employee theEmployee) {
        employee = theEmployee;
    }

    @GetMapping("/getFirstName")
    public String getFirstName() {

        return employee.getFirstName();
    }

    @GetMapping("/getDepartment")
    public String getDepartment() {

        return employee.getDepartment();
    }

}
