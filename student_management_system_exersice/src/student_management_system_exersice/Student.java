package student_management_system_exersice;

public class Student {
	
	protected String name;
	protected int studentID;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	@Override
	 public String toString() {
	        return "Student Name: " + name + "\nStudent ID: " + studentID;
	 }
}
