package unique_number_counter_exercise;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Set<Integer> uniqueNumbers = new HashSet<>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\nMenu:");
			System.out.println("1. Input numbers");
			System.out.println("2. Count unique numbers");
			System.out.println("3. Display unique number count");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				inputNumbers(uniqueNumbers, scanner);
				break;
			case 2:
				int count = countUniqueNumbers(uniqueNumbers);
				System.out.println("Number of unique numbers: " + count);
				break;
			case 3:
				displayCount(uniqueNumbers);
				break;
			case 4:
				System.out.println("Exiting the program.");
				scanner.close();
				System.exit(0);
			default:
				System.out.println("Invalid choice. Please select a valid option.");
			}
		}
	}

	public static void inputNumbers(Set<Integer> uniqueNumbers, Scanner scanner) {
		System.out.println("Enter numbers (type 'finish' to stop):");
		while (true) {
			String input = scanner.next();
			if (input.equalsIgnoreCase("finish")) {
				break;
			}
			if (isInteger(input)) {
				int num = Integer.parseInt(input);
				uniqueNumbers.add(num);
			} else {
				System.out.println("Invalid input. Please enter valid numbers or 'finish' to stop.");
			}
		}
		System.out.println("Numbers added to the set.");
	}

	public static boolean isInteger(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static int countUniqueNumbers(Set<Integer> uniqueNumbers) {
		return uniqueNumbers.size();
	}

	public static void displayCount(Set<Integer> uniqueNumbers) {
		int count = countUniqueNumbers(uniqueNumbers);
		System.out.println("Number of unique numbers: " + count);
	}
}