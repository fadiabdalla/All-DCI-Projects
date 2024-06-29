package student_grade_tracker_exercise;

import java.util.HashMap;
import java.util.Map;

public class Student {

	 String name;
     Map<String, Double> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new HashMap<>();
    }


    public void addGrade(String subject, double grade) {
        grades.put(subject, grade);
    }
}