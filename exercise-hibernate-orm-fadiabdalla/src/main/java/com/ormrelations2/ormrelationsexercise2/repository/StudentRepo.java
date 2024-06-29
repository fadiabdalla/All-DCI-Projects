package com.ormrelations2.ormrelationsexercise2.repository;

import com.ormrelations2.ormrelationsexercise2.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
