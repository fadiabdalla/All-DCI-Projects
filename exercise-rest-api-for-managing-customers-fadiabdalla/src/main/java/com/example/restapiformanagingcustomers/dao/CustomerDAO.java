package com.example.restapiformanagingcustomers.dao;

import com.example.restapiformanagingcustomers.entity.Customer;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CustomerDAO implements CustomerDAOInterface{

    EntityManager entityManager;

    @Autowired
    public CustomerDAO(EntityManager em){

        entityManager=em;
    }

    @Override
    public List<Customer> findAll() {
        TypedQuery<Customer> query = entityManager.createQuery("FROM Customer",Customer.class);


        return query.getResultList();
    }

    @Override
    public Customer findById(Integer id) {
        Customer customer = entityManager.find(Customer.class,id);


        return customer;
    }

    @Override
    public Customer update(Customer customer) {
        Customer updatedCustomer = entityManager.merge(customer);

        return updatedCustomer;
    }

    @Override
    public void deleteById(Integer id) {

        Customer customer = entityManager.find(Customer.class,id);

        entityManager.remove(customer);




    }
}
