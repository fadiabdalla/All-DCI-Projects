package interfaces_online_courses;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
	
	private final List<OnlineCourse> courses = new ArrayList<>();

    
    public void addCourse(OnlineCourse course) {
        courses.add(course);
    }

    public void enrollStudentInCourse(String studentName, OnlineCourse course) {
        course.enrollStudent(studentName);
    }

    public void displayAllCourseDetails() {
        for (OnlineCourse course : courses) {
            course.displayCourseDetails();
            System.out.println();
        }
    }


}
