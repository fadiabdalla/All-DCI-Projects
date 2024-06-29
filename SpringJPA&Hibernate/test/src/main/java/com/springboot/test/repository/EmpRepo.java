package com.springboot.test.repository;

import com.springboot.test.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository <Employee,Integer>{


}
