package interfaces_online_courses;

public class Main {

	public static void main(String[] args) {
		CourseManager courseManager = new CourseManager();

        ProgrammingCourse programmingCourse = new ProgrammingCourse("Java ", "Professor Meyer");
        MathCourse mathCourse = new MathCourse("Arrays", "Professor Kane");

        courseManager.addCourse(programmingCourse);
        courseManager.addCourse(mathCourse);

        courseManager.enrollStudentInCourse("Harry", programmingCourse);
        courseManager.enrollStudentInCourse("Sam", programmingCourse);
        courseManager.enrollStudentInCourse("Sarah", mathCourse);
        courseManager.enrollStudentInCourse("Emma", mathCourse);

        courseManager.displayAllCourseDetails();
    }

	}


