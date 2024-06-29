package com.crudApllication.crudApplicationExercise.dao;

import com.crudApllication.crudApplicationExercise.entity.Patient;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PatientDAO implements PatientDAOInterface {


    EntityManager entityManager;


    @Autowired
    public PatientDAO(EntityManager entityManager){

        this.entityManager = entityManager;
    }


    @Transactional
    @Override
    public void save(Patient patient) {
        entityManager.persist(patient);


    }

    @Override
    public Patient findById(Integer id) {
        return entityManager.find(Patient.class, id) ;
    }

    @Override
    public List<Patient> findAll() {

        TypedQuery<Patient> query = entityManager.createQuery("FROM Patient order by lastName",Patient.class);
        return  query.getResultList();
    }
}
