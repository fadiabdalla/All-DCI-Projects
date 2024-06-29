package com.example.restapiservice.service;

import com.example.restapiservice.dao.TeacherDAOInterface;
import com.example.restapiservice.entity.Teacher;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherService implements TeacherServiceInterface{

    private TeacherDAOInterface teacherDAOInterface;

    @Autowired
    public TeacherService(TeacherDAOInterface tDAO) {
        this.teacherDAOInterface = tDAO;
    }
    @Override
    public List<Teacher> findAll() {
        return teacherDAOInterface.findAll();
    }

    @Override
    public Teacher findById(int id) {
        return teacherDAOInterface.findById(id);
    }

    @Transactional
    @Override
    public Teacher update(Teacher teacher) {
        return teacherDAOInterface.update(teacher);
    }

    @Transactional
    @Override
    public void deleteById(int id) {
        teacherDAOInterface.deleteById(id);

    }
}
