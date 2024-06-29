package com.example.restapiformanagingcustomers.dao;

import com.example.restapiformanagingcustomers.entity.Customer;

import java.util.List;

public interface CustomerDAOInterface {

    List<Customer> findAll();

    Customer findById(Integer id);

    Customer update(Customer customer);

    void deleteById (Integer id);

}
