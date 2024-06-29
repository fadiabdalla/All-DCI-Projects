package interfaces_online_courses;

import java.util.ArrayList;
import java.util.List;

public class MathCourse implements OnlineCourse {

	private final String courseName;
	private final String instructorName;
	private final List<String> students = new ArrayList<>();
	
	public MathCourse(String courseName, String instructorName) {
		super();
		this.courseName = courseName;
		this.instructorName = instructorName;
	}

	@Override
	public void enrollStudent(String studentName) {
		students.add(studentName);

	}

	@Override
	public final void displayCourseDetails() {
		System.out.println("Course details : ");
		System.out.println("Course : " + courseName);
		System.out.println("Instructor : " + instructorName);
		System.out.println("Enrolled students :");
		for (String n : students) {
			System.out.println(n);

		}

	}

}
