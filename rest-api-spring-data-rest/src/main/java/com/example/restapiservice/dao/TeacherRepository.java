package com.example.restapiservice.dao;

import com.example.restapiservice.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "instructors")
public interface TeacherRepository extends JpaRepository<Teacher,Integer> {
}
