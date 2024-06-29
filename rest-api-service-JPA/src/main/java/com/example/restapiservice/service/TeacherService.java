package com.example.restapiservice.service;

import com.example.restapiservice.dao.TeacherRepository;
import com.example.restapiservice.entity.Teacher;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService implements TeacherServiceInterface{

    private TeacherRepository teacherRepo;

    @Autowired
    public TeacherService(TeacherRepository tRepo) {
        this.teacherRepo = tRepo;
    }
    @Override
    public List<Teacher> findAll() {
        return teacherRepo.findAll();
    }

    @Override
    public Teacher findById(int id) {

        Optional<Teacher> result = teacherRepo.findById(id);

       return result.orElse(null);
    }

    @Transactional
    @Override
    public Teacher update(Teacher teacher) {
        return teacherRepo.save(teacher);
    }

    @Transactional
    @Override
    public void deleteById(int id) {
        teacherRepo.deleteById(id);

    }
}
