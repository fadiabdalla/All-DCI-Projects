package student_database_exercise;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		HashMap<String, Integer> students = new HashMap<>();
		int choice;
		String name;
		int id;

		System.out.println("Student Database Manager");
		System.out.println("---------------------------");
		do {

			System.out.println("Menu : ");
			System.out.println("1. Add Student.");
			System.out.println("2. Retrieve student ID.");
			System.out.println("3. Display database.");
			System.out.println("4. Exit.");

			choice = scanner.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter student's name : ");
				name = scanner.next();
				System.out.println("Enter student's ID : ");
				id = scanner.nextInt();
				students.put(name, id);
				System.out.println("The student " + name + " with the ID number" + id + " has bin added.");

				break;

			case 2:

				System.out.println("Enter the student's name to show his/her ID : ");

				name = scanner.next();
				
			if (students.get(name) != null) {
				System.out.println(name + "'s ID : " + students.get(name));
			} else {
				
				System.out.println("The student name you entered is noz found.");
			}
				
				break;

			case 3:

				for (Map.Entry<String, Integer> student : students.entrySet()) {
					System.out.println(student.getKey() + " : " + student.getValue());

				}
				break;
			case 4:

				System.out.println("Exiting...");
				break;

			}

		} while (choice != 4);

	
		scanner.close();
	}
}
