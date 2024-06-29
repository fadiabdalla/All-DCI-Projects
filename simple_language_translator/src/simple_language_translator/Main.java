package simple_language_translator;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		HashMap<String, String> words = new HashMap<>();
		int choice;
		String word;
		String translation;

		System.out.println("Language Translator");
		System.out.println("---------------------------");
		do {

			System.out.println("Menu : ");
			System.out.println("1. Add translation.");
			System.out.println("2. Look up translation.");
			System.out.println("3. Display translator.");
			System.out.println("4. Exit.");

			choice = scanner.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter a word : ");
				word = scanner.next();
				System.out.println("Enter the translation : ");
				translation = scanner.next();
				words.put(word, translation);
				System.out.println("The word has been added");

				break;

			case 2:

				System.out.println("Enter a word to look up : ");

				word = scanner.next();

				if (words.get(word) != null) {
					System.out.println(word + "  : " + words.get(word));
				} else {

					System.out.println("The word is not found in the Database.");
				}

				break;

			case 3:

				for (Map.Entry<String, String> vocab : words.entrySet()) {
					System.out.println(vocab.getKey() + " : " + vocab.getValue());

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
