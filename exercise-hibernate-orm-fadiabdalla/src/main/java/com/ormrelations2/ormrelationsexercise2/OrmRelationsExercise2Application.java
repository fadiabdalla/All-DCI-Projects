package com.ormrelations2.ormrelationsexercise2;

import com.ormrelations2.ormrelationsexercise2.entity.Course;
import com.ormrelations2.ormrelationsexercise2.entity.Student;
import com.ormrelations2.ormrelationsexercise2.repository.CourseRepo;
import com.ormrelations2.ormrelationsexercise2.repository.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OrmRelationsExercise2Application {

	public static void main(String[] args) {
		SpringApplication.run(OrmRelationsExercise2Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner (CourseRepo courseRepo, StudentRepo studentRepo){


		return runner -> {
			//createStudentsAndCourses(courseRepo,studentRepo);
			//readAllStudents(studentRepo);
			//updateStudent(studentRepo);
			deleteStudent(studentRepo);

		};
	}

	private void deleteStudent(StudentRepo studentRepo) {

		studentRepo.deleteById(3);
		System.out.println("Student with id 3 deleted!");
	}

	private void updateStudent(StudentRepo studentRepo) {

		Student student = studentRepo.findById(3).orElse(null);
		if(student != null){
			student.setLastName("Hecke");
			studentRepo.save(student);
			System.out.println("Student updated: " + student);

		}else {
			System.out.println("Student not found!");
		}

	}

	private void readAllStudents(StudentRepo studentRepo) {

		studentRepo.findAll().forEach(System.out::println);
	}

	private void createStudentsAndCourses(CourseRepo courseRepo, StudentRepo studentRepo) {

		Course course1 = new Course();
		Course course2 = new Course();
		Course course3 = new Course();

		course1.setName("Math");
		course1.setDuration(45);

		course2.setName("Scince");
		course2.setDuration(60);

		course3.setName("English");
		course3.setDuration(30);

		courseRepo.save(course1);
		courseRepo.save(course2);
		courseRepo.save(course3);


		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		Student student4 = new Student();
		Student student5 = new Student();
		Student student6 = new Student();

		student1.setFirstName("Fadi");
		student1.setLastName("Georgos");
		student1.setCourse(course1);

		student2.setFirstName("Sandy");
		student2.setLastName("Smith");
		student2.setCourse(course1);

		student3.setFirstName("Sam");
		student3.setLastName("Schneider");
		student3.setCourse(course2);

		student4.setFirstName("Pia");
		student4.setLastName("Müller");
		student4.setCourse(course3);

		student5.setFirstName("Johnas");
		student5.setLastName("Meyer");
		student5.setCourse(course3);

		student6.setFirstName("Alex");
		student6.setLastName("Chamoun");
		student6.setCourse(course3);

		studentRepo.save(student1);
		studentRepo.save(student2);
		studentRepo.save(student3);
		studentRepo.save(student4);
		studentRepo.save(student5);
		studentRepo.save(student6);

		System.out.println("6 Students and 3 Courses added!");

	}
}
