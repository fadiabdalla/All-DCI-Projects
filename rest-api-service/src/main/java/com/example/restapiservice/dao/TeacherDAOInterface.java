package com.example.restapiservice.dao;

import com.example.restapiservice.entity.Teacher;

import java.util.List;

public interface TeacherDAOInterface {

    public List<Teacher> findAll();

    Teacher findById(int id);

    Teacher update(Teacher teacher);
    void deleteById(int id);
}
