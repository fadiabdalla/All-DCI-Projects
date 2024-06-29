package com.example.restapiformanagingcustomers.service;

import com.example.restapiformanagingcustomers.dao.CustomerDAOInterface;
import com.example.restapiformanagingcustomers.entity.Customer;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CustomerService implements CustomerServiceInterface{

    CustomerDAOInterface customerDAOInterface;

    @Autowired
    public CustomerService(CustomerDAOInterface cDAO){

        customerDAOInterface=cDAO;
    }
    @Override
    public List<Customer> findAll() {
        return customerDAOInterface.findAll();
    }

    @Override
    public Customer findById(Integer id) {
        return customerDAOInterface.findById(id);
    }

    @Transactional
    @Override
    public Customer update(Customer customer) {
        return customerDAOInterface.update(customer);
    }

    @Transactional
    @Override
    public void deleteById(Integer id) {

        customerDAOInterface.deleteById(id);
    }
}
