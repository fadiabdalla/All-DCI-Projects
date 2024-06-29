package com.example.restapiformanagingcustomers.service;

import com.example.restapiformanagingcustomers.entity.Customer;

import java.util.List;

public interface CustomerServiceInterface {

    List<Customer> findAll();

    Customer findById(Integer id);

    Customer update(Customer customer);

    void deleteById (Integer id);
}
