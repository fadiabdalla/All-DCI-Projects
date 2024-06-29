package improve_code_exercise;

import java.util.Scanner;

public class Sample3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Task task = new Task();

		// 1.Use try-catch-finally to handle exceptions.
		try {

			// 2. It's more user friendly if we use a clear guidance.
			System.out.println("Welcome to the Text Processing Program!");
			System.out.println("Please input a sentence. The program will count words,");
			System.out.println("find the longest word, and remove vowels from the sentence.");

			String input = "";
			// 3. Ensure user input is not empty
			while (input.isEmpty()) {
				System.out.print("Enter a sentence: ");
				input = scanner.nextLine();
				if (input.isEmpty()) {
					System.out.println("Please enter a valid sentence.");
				}
			}

			

			  // Task 1: Count the number of words in the sentence.
            task.wordCounter(input);

            // Task 2: Find and print the longest word in the sentence.
            task.findAndPrintLongestWord(input);

            // Task 3: Remove vowels from the sentence.
            task.removeVowels(input);

			
			
		} catch (Exception e) {

			System.out.println("An error occurred: " + e.getMessage());
		// Use Finally to ensure the scanner will be closed even if an exception has been occurred.
		} finally {
			scanner.close();
		}
	}
}

	