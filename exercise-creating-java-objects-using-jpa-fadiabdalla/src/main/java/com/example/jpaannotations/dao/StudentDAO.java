package com.example.jpaannotations.dao;

import com.example.jpaannotations.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class StudentDAO implements StudentDAOInterface{



    EntityManager entityManager;


    @Autowired
    public StudentDAO (EntityManager entityManager){

        this.entityManager = entityManager;
    }

    @Transactional
    @Override
    public void save(Student student) {


        entityManager.persist(student);



    }
}
