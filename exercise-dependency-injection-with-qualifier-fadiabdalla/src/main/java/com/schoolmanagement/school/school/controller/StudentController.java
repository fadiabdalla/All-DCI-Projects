package com.schoolmanagement.school.school.controller;

import com.schoolmanagement.school.school.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    Student student;
    @Autowired
    public StudentController (@Qualifier("firstStudent") Student st){

        student = st;
    }


    @GetMapping("/getFirstName")
        public String getFirstName() {

            return student.getFirstName();
        }

    @GetMapping("/getLastName")
    public String getLastName() {

        return student.getlastName();
    }

    @GetMapping("/getScore")
    public String getScore() {

        return student.getScore();
    }

}
