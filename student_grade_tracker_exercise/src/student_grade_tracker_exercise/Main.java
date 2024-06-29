package student_grade_tracker_exercise;

import java.util.*;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {

		  Map<Integer, String> students = new TreeMap<>();
	        Map<Integer, Map<String, Double>> grades = new HashMap<>();
	        Scanner scanner = new Scanner(System.in);
	        String name;
	        int id;
	        int choice;

	        do {
	            System.out.println("\nStudent Grade Tracker Menu:");
	            System.out.println("1. Add a new student");
	            System.out.println("2. Input grades for a student");
	            System.out.println("3. Calculate and display average grades");
	            System.out.println("4. View student information");
	            System.out.println("5. Quit");
	            System.out.print("Enter your choice: ");
	            choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("Enter student's name: ");
	                    name = scanner.next();
	                    System.out.println("Enter student's ID: ");
	                    id = scanner.nextInt();
	                    students.put(id, name);
	                    grades.put(id, new HashMap<>());
	                    System.out.println("The student " + name + " with the ID number " + id + " has been added.");
	                    break;

	                case 2:
	                    System.out.println("Enter the student's ID: ");
	                    id = scanner.nextInt();

	                    if (students.containsKey(id)) {
	                        System.out.println("Student: " + students.get(id) + ", ID: " + id);
	                        
	                        System.out.println("Enter Math's grade:");
	                        double math = scanner.nextDouble();
	                        System.out.println("Enter Science's grade:");
	                        double science = scanner.nextDouble();
	                        System.out.println("Enter History's grade:");
	                        double history = scanner.nextDouble();
	                        System.out.println("Enter English's grade:");
	                        double english = scanner.nextDouble();

	                        Map<String, Double> studentGrades = grades.get(id);
	                        studentGrades.put("Math", math);
	                        studentGrades.put("Science", science);
	                        studentGrades.put("History", history);
	                        studentGrades.put("English", english);
	                    } else {
	                        System.out.println("The student ID you entered is not found.");
	                    }
	                    break;

	                case 3:
	                    for (Map.Entry<Integer, String> student : students.entrySet()) {
	                        int studentId = student.getKey();
	                        String studentName = student.getValue();
	                        Map<String, Double> studentGrades = grades.get(studentId);

	                        if (studentGrades != null && !studentGrades.isEmpty()) {
	                            double sum = 0.0;
	                            int count = 0;

	                            for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
	                                sum += entry.getValue();
	                                count++;
	                            }

	                            double average = sum / count;
	                            System.out.println(studentName + "'s Average Grade: " + average);
	                        } else {
	                            System.out.println(studentName + " has no grades entered.");
	                        }
	                    }
	                    break;

	                case 4:
	                    System.out.println("Enter the student's ID to view information: ");
	                    id = scanner.nextInt();

	                    if (students.containsKey(id)) {
	                        String studentName = students.get(id);
	                        Map<String, Double> studentGrades = grades.get(id);

	                        System.out.println("Student Name: " + studentName);
	                        System.out.println("Student ID: " + id);
	                        System.out.println("Grades:");

	                        for (Map.Entry<String, Double> entry : studentGrades.entrySet()) {
	                            System.out.println(entry.getKey() + ": " + entry.getValue());
	                        }
	                    } else {
	                        System.out.println("The student ID you entered is not found.");
	                    }
	                    break;

	                case 5:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    break;
	            }

	        } while (choice != 5);

	        scanner.close();
	    }
	}