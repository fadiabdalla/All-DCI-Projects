package functional_programming_4_exercise;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Student {
	private int id;
	private String name;
	private double gpa;

	public Student(int id, String name, double gpa) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getGpa() {
		return gpa;
	}

	@Override
	public String toString() {
		return "ID: " + id + " | Name: " + name + " | GPA: " + gpa;
	}
}

class StudentManager {
	private List<Student> students;

	public StudentManager() {
		this.students = new ArrayList<>();
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	public void displayAllStudents() {
		if (students.isEmpty()) {
			System.out.println("\nThe list is empty.");
		} else {
			students.forEach(System.out::println);
		}
	}

	public List<Student> findStudentById(int id) {
		Predicate<Student> predicate = student -> student.getId() == id;
		return students.stream().filter(predicate).collect(Collectors.toList());
	}

	public double calculateAverageGPA() {

		double average = students.stream().mapToDouble(Student::getGpa).average().orElse(0);
		return average;
	}
}

public class StudentManagementSystem {
	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("\nStudent Management System Menu:");
				System.out.println("1. Add a new student");
				System.out.println("2. Display all students");
				System.out.println("3. Search for a student by ID");
				System.out.println("4. Calculate average GPA");
				System.out.println("5. Exit");
				System.out.print("Enter your choice: ");
				int choice = scanner.nextInt();
				scanner.nextLine(); // Consume newline
				switch (choice) {
				case 1:
					System.out.print("Enter student ID: ");
					int id = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Enter student name: ");
					String name = scanner.nextLine();
					System.out.print("Enter student GPA: ");
					double gpa = scanner.nextDouble();
					studentManager.addStudent(new Student(id, name, gpa));
					break;
				case 2:
					studentManager.displayAllStudents();
					break;
				case 3:
					System.out.print("Enter student ID to search: ");
					int searchId = scanner.nextInt();
					List<Student> foundStudent = studentManager.findStudentById(searchId);

					if (foundStudent != null) {
						System.out.println("Student found: " + foundStudent);
					} else {
						System.out.println("Student not found!");
					}
					break;

				case 4:
					System.out.println("Average GPA: " + studentManager.calculateAverageGPA());
					break;
				case 5:
					System.out.println("Exiting the Student Management System. Goodbye!");
					scanner.close();
				default:
					System.out.println("Invalid choice. Please try again.");
				}
			} catch (InputMismatchException e) {
				System.out.println("\nWrong Input. Please enter a number.");

			}
		}
	}
}