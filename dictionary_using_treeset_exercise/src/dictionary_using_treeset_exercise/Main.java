package dictionary_using_treeset_exercise;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Set<String> words = new TreeSet<>();

		Scanner scanner = new Scanner(System.in);

		int choice;

		do {
			System.out.println("\nMenu:");
			System.out.println("1. Add a word.");
			System.out.println("2. Search for a word.");
			System.out.println("3. Display dictionary.");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");

			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Enter your new word to add : ");
				String newWord = scanner.next();
				words.add(newWord);
				System.out.println("The word" + "(" + newWord + ") has been added.");
				break;
			case 2:
				System.out.println("Enter a word : ");
				String searchedWord = scanner.next();
				if (words.contains(searchedWord)) {

					System.out.println("(" + searchedWord + ") is exist in the dictinary.");
				} else {
					System.out.println("(" + searchedWord + ") is  not exist ! You can add it .");
				}
				break;
			case 3:
				System.out.println("The dictionary contains these words : ");
				for (String dict : words) {

					System.out.println(dict);
				}
				break;
			case 4:
				System.out.println("Exiting the program.");
				scanner.close();
			default:
				System.out.println("Invalid choice. Please select a valid option.");
			}
		} while (choice != 4);

	}

}
