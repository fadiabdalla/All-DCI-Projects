package com.springboot.test.service;


import com.springboot.test.model.dto.EmployeeDto;
import com.springboot.test.model.entity.Employee;
import com.springboot.test.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpService {

    @Autowired
    private EmpRepo empRepo;

    public EmployeeDto getUser(Integer id){
        Optional<Employee> employee  = this.empRepo.findById(id);

        if (employee.isPresent()) {
            return EmployeeDto.toDto(employee.get());
        }else {
            return null;
        }
    }

    public EmployeeDto saveEmp (EmployeeDto employee){

       return EmployeeDto.toDto(empRepo.save(Employee.toEntity(employee)));
    }
    public void delete (Integer id) {

       this.empRepo.deleteById(id);

    }

    public List<Employee> getAll() {

        return this.empRepo.findAll();
    }
}
