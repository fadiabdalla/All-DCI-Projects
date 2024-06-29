package com.example.restapiservice.controller;

import com.example.restapiservice.entity.Teacher;
import com.example.restapiservice.service.TeacherServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TeacherController {

    //private TeacherDAOInterface teacherDAOInterface;
    private TeacherServiceInterface teacherServiceInterface;
    @Autowired
    public TeacherController(TeacherServiceInterface tService){
        teacherServiceInterface = tService;
    }

    @GetMapping("/teachers")
    public List<Teacher> findAll(){

        return teacherServiceInterface.findAll();
    }

    @GetMapping("/findTeacherById/{teacherId}")
    public Teacher findTeacherById( @PathVariable int teacherId){

         Teacher teacher = teacherServiceInterface.findById(teacherId);
         if(teacher == null){
             throw new RuntimeException("Teacher id not found: " + teacherId);
         }
         return teacher;
    }

    @PostMapping("/addTeacher")
    public Teacher addTeacher (@RequestBody Teacher teacher){


        teacher.setId(0);
        Teacher createdTeacher = teacherServiceInterface.update(teacher);
        return createdTeacher;

    }

    @PutMapping("/updateTeacher")
    public Teacher updateTeacher (@RequestBody Teacher teacher){

        Teacher updatedTeacher = teacherServiceInterface.update(teacher);
        return updatedTeacher;

    }


    @DeleteMapping("/teachers/{teacherId}")
    public String deleteTeacher(@PathVariable int teacherId){
        Teacher teacher = teacherServiceInterface.findById(teacherId);
        if(teacher == null){
            throw new RuntimeException("Teacher id not found: " + teacherId);
        }
        teacherServiceInterface.deleteById(teacherId);
        return "Deleted Teacher with id: " + teacherId;
    }

}
