package com.example.jpaannotations;

import com.example.jpaannotations.dao.StudentDAOInterface;
import com.example.jpaannotations.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class jpaAnnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(jpaAnnotationApplication.class, args);
	}

    @Bean

public CommandLineRunner commandLineRunner (StudentDAOInterface studentDAO){

    return runner -> {

        saveUser(studentDAO);
    };


    }

    public void saveUser (StudentDAOInterface studentDAO){

    Student newStudent = new Student("Fadi","Georgos Abdallah", 1791286799 );
    studentDAO.save(newStudent);

}
}

