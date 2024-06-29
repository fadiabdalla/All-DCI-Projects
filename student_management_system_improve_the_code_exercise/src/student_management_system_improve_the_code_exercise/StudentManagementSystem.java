package student_management_system_improve_the_code_exercise;

import java.util.ArrayList;

class StudentManagementSystem {

	ArrayList<Student> students = new ArrayList<Student>();

	private boolean isStudentIDExist(String studentID) {
		for (Student student : students) {
			if (student.studentID.equals(studentID)) {
				return true;
			}
		}
		return false;
	}

	public void addStudent(String name, int age, String studentID, ArrayList<String> courses,
			String contactInformation) {
		if (Student.isValidName(name) && Student.isValidAge(age)) {
			if (!isStudentIDExist(studentID)) {
				Student student = new Student(name, age, studentID, courses, contactInformation);
				students.add(student);
				System.out.println("Student added successfully!");
			} else {
				System.out.println("Error: Student with the given StudentID already exists in the database.");
			}
		} else {
			System.out.println("Error: Invalid name or age. Please enter valid information.");
		}
	}

	public void removeStudent(String studentID) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).studentID.equals(studentID)) {
				students.remove(i);
				System.out.println("Student removed successfully!");
				return;
			}
		}
		System.out.println("Error: Student with the given StudentID not found in the database.");
	}

	public void listStudents() {
		System.out.println("Student List:");
		for (Student student : students) {
			System.out.println("Name: " + student.name);
			System.out.println("Age: " + student.age);
			System.out.println();
		}
	}

}