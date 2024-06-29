package com.example.crudapp.dao;

import com.example.crudapp.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository // Helps Spring find your DAO methods.
public class EmployeeDAO implements EmployeeDAOInterface
{

    // Define the field for the Entity Manager

    private EntityManager entityManager;

    // Inject the Entity Manager using constructor
    @Autowired
    public EmployeeDAO (EntityManager entityManager){

        this.entityManager = entityManager;
    }

    // Implement the save method

    @Transactional // Add @Transactional in the DAO methods that modify database.
    @Override
    public void save(Employee employee) {
        
        entityManager.persist(employee);
    }



    @Override
    public Employee findById(Integer id) {

        return entityManager.find(Employee.class,id);
    }

    @Override
    public List<Employee> findAll() {

        // The following syntax is called JPQL(Jakarta Persistence Query Language )
        // All JPQL syntax is based on the entity name and entity fields.
        // TypedQuery is an interface that is part of JPA.
        // TypedQuery Interface is helpful when you what to retrieve all the data from the database.
        TypedQuery<Employee> query = entityManager.createQuery("FROM Employee order by lastName", Employee.class);
        return query.getResultList();
    }


    @Override
    public List<Employee> findByLastName(String theLastName) {
        // Create query
        TypedQuery<Employee> query = entityManager.createQuery("FROM Employee WHERE lastName=:theData", Employee.class);
        query.setParameter("theData",theLastName);
        return query.getResultList();
    }

    @Transactional
    @Override
    public void update(Employee employee) {

        entityManager.merge(employee);

    }

    @Transactional
    @Override
    public void delete(Integer id) {

        Employee employee = entityManager.find(Employee.class,id);
        entityManager.remove(employee);

    }

    @Transactional
    @Override
    public int deleteAll() {

        int rowsDeleted = entityManager.createQuery("DELETE FROM Employee").executeUpdate();

        return  rowsDeleted;




    }


}
