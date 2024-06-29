package lambda_expression_student_grading_exercise;

public class Student {

	String name;
	int score;

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student Name: " + name + ", Score: " + score;
	}
}
