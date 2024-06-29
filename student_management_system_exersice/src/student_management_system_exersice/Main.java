package student_management_system_exersice;

import java.util.*;

public class Main {
	public static void main (String args[]) {
		
		
		Map<Integer, Student> students = new HashMap<>();
		
		UndergraduateStudent undergraduateStudent = new UndergraduateStudent();
		GraduateStudent graduateStudent = new GraduateStudent();
		
		 undergraduateStudent.setName("Fadi Georgos Abdallah");
	        undergraduateStudent.setStudentID(456);
	        undergraduateStudent.setYear(1);
	        students.put(undergraduateStudent.getStudentID(), undergraduateStudent);

		
		
		graduateStudent.setName("Sandy Kassab");
        graduateStudent.setStudentID(75);
        graduateStudent.setResearchTopic("Java Backend Developer");
        students.put(graduateStudent.getStudentID(), graduateStudent);
		

        for (Student student : students.values()) {
            System.out.println(student);
            System.out.println();
        }

        
    }
}