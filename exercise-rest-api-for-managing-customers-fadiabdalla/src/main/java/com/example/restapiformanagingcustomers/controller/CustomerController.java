package com.example.restapiformanagingcustomers.controller;

import com.example.restapiformanagingcustomers.entity.Customer;
import com.example.restapiformanagingcustomers.service.CustomerServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    CustomerServiceInterface cs;

    @Autowired
    public CustomerController(CustomerServiceInterface customerServiceInterface){

        cs=customerServiceInterface;
    }

    @GetMapping("/findAll")
    public List<Customer> findALl(){
        return cs.findAll();
    }
    @GetMapping("/getCustomer")
    public Customer getCustomerById(@RequestParam Integer id){

        return cs.findById(id);
    }

    @PostMapping("/updateCustomer")
    public Customer updateCustomer(@RequestBody Customer customer){

        return cs.update(customer);
    }

    @GetMapping("/deleteCustomer")
    public void deleteCustomerById(@RequestParam Integer id){

        cs.deleteById(id);
    }




}
