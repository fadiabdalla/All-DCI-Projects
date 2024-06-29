package com.springboot.test.controller;

import com.springboot.test.model.dto.EmployeeDto;
import com.springboot.test.model.entity.Employee;
import com.springboot.test.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmpService empService;


    @GetMapping("/get-emp")
    public EmployeeDto getUser(@RequestParam Integer id){
        return empService.getUser(id);

    }

    @PostMapping ("/save-emp")
    public EmployeeDto save(@RequestBody EmployeeDto employee){
        return empService.saveEmp(employee);

    }

    @GetMapping("/delete-emp")
    public void delete(@RequestParam Integer id){
         empService.delete(id);

    }

    @PostMapping ("/update-emp")
    public EmployeeDto update(@RequestBody EmployeeDto employee){
        return empService.saveEmp(employee);

    }

    @GetMapping("/get-all")
    public List<Employee> getAll(){
        return empService.getAll();

    }


}
