package event_registration_system_hashset_exercise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		EventRegistration register = new EventRegistration();

		System.out.println("Event Registration manger.");
		while (true) {
			System.out.println("Enter the name of the participant :");
			String name = scanner.next();
			scanner.nextLine();

			if (name.equalsIgnoreCase("exit")) {
				break;
			}

			register.registerParticipant(name);
		}

		register.displayParticipants();
	}
}
