package student_management_system_improve_the_code_exercise;

import java.util.ArrayList;

public class Student {
	String name;
	int age;
	String studentID;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static boolean isValidName(String name) {
		if (name.matches("^[a-zA-Z\\s]+")) {

			return true;
		} else {
			return false;
		}
	}

	public static boolean isValidAge(int age) {
		
		if (age >= 0 && age <= 60) {

			return true;
			
		} else {
			return false;
		}
		
		
		
	}
}
