package lambda_expression_student_grading_exercise;

import java.util.ArrayList;
import java.util.List;

public class LambdaExercise {

	static List<String> gradeStudents(List<Student> students) {
		List<String> results = new ArrayList<>();
		students.forEach((student) -> {
			if (student.score >= 90 && student.score <= 100) {
				results.add("Student Name: " + student.name + ", Grade: A");
			} else if (student.score >= 80 && student.score < 90) {
				results.add("Student Name: " + student.name + ", Grade: B");
			} else if (student.score >= 70 && student.score < 80) {
				results.add("Student Name: " + student.name + ", Grade: C");
			} else if (student.score >= 60 && student.score < 70) {
				results.add("Student Name: " + student.name + ", Grade: D");
			} else if (student.score >= 0 && student.score < 60) {
				results.add("Student Name: " + student.name + ", Grade: F");
			} else {

				System.out.println("Error! somthing is wrong. The Score must be between 0-100!");
			}

		});

		return results;
	}

	public static void main(String[] args) {

		List<Student> students = new ArrayList<>();

		Student student1 = new Student("Fadi", 92);
		Student student2 = new Student("Sam", 63);
		Student student3 = new Student("Nadia", 72);
		Student student4 = new Student("Joseph", 85);
		Student student5 = new Student("Joe", 60);
		Student student6 = new Student("Alex", 55);
		Student student7 = new Student("Sarah", 40);

		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);
		students.add(student7);

		List<String> results = gradeStudents(students);

		System.out.println("The original List: ");
		students.forEach(System.out::println);

		System.out.println("Graded Student List: ");
		results.forEach(System.out::println);

	}

}
