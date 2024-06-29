package com.ormrelations2.ormrelationsexercise2.repository;

import com.ormrelations2.ormrelationsexercise2.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course,Integer> {
}
