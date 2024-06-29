package simple_phone_book_exercise;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		HashMap<String, Long> contacts = new HashMap<>();

		String name;
		long phoneNumber;
		int choice;

		System.out.println("Phone Book");
		System.out.println("--------------------------");
		do {
			System.out.println("Menu : ");
			System.out.println("1. Add contact.");
			System.out.println("2. Look up phone number.");
			System.out.println("3. Display phone book.");
			System.out.println("4. Exit.");

			choice = scanner.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Add contact ");
				System.out.println("--------------------------");
				System.out.println("Enter the name : ");
				name = scanner.next();
				System.out.println("Enter the phone number : ");
				phoneNumber = scanner.nextLong();
				contacts.put(name, phoneNumber);
				System.out.println("Contact added to the Phone Book");

				break;

			case 2:
				System.out.println("Enter a name to show her/his phone number :");
				name = scanner.next();

				if (contacts.get(name) != null) {

					System.out.println(name + " : " + contacts.get(name));

				} else {

					System.out.println("The contact not found.");
				}
				break;

			case 3:
				for (Map.Entry<String, Long> contact : contacts.entrySet()) {

					System.out.println(contact.getKey() + " : " + contact.getValue());
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
