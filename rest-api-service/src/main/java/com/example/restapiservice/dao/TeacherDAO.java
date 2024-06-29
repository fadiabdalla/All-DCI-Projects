package com.example.restapiservice.dao;

import com.example.restapiservice.entity.Teacher;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeacherDAO implements TeacherDAOInterface {

    private EntityManager entityManager;

    @Autowired
    public TeacherDAO(EntityManager em){
        entityManager = em;
    }

    @Override
    public List<Teacher> findAll() {

        TypedQuery<Teacher> query = entityManager.createQuery("from Teacher", Teacher.class);

        List<Teacher> teachers = query.getResultList();
        return teachers;
    }

    @Override
    public Teacher findById(int id) {
        Teacher teacher = entityManager.find(Teacher.class, id);

        return teacher;
    }

    @Override
    public Teacher update(Teacher teacher) {
        Teacher teacherDB = entityManager.merge(teacher);

        return teacherDB;
    }

    @Override
    public void deleteById(int id) {
        Teacher teacher = entityManager.find(Teacher.class,id);
        entityManager.remove(teacher);
    }
}
