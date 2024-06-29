package student_grade_tracker_with_2D_arrays_exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String[] subjects = {"Math", "Science", "English", "History"};	
		String[][] students = new String[100][subjects.length + 1];
		
		
		 System.out.println("\nMenu:");
         System.out.println("1. Add student's name and grades");
         System.out.println("2. Calculate average grades");
         System.out.println("3. Display student names and average grades");
         System.out.println("4. Exit");
         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();

		
		
		
		
	}

}
