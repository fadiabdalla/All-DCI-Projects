package com.crudApllication.crudApplicationExercise.dao;

import com.crudApllication.crudApplicationExercise.entity.Patient;

import java.util.List;

public interface PatientDAOInterface {

    void save(Patient patient);

    Patient findById(Integer id);

    List<Patient> findAll();

    void updatePatient(Patient patient);

    void delete(Integer id);

    int deleteAll();

}
