package date_and_time_reminders_exercise;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		List<Reminder> reminders = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		boolean validInput = false;

		Reminder reminder1 = new Reminder("Meeting with client", LocalDateTime.of(2023, 9, 20, 14, 0));
		Reminder reminder2 = new Reminder("Submit project report", LocalDateTime.of(2023, 9, 22, 10, 30));
		Reminder reminder3 = new Reminder("Birthday party", LocalDateTime.of(2023, 10, 5, 18, 0));

		reminders.add(reminder1);
		reminders.add(reminder2);
		reminders.add(reminder3);

		do {
			System.out.print("Enter a date and time in the future (YYYY-MM-DD HH:mm): ");
			String inputDateTime = scanner.nextLine();

			try {
				LocalDateTime targetDateTime = LocalDateTime.parse(inputDateTime,
						DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

				System.out.println("Upcoming Reminders:");
				boolean found = false;
				for (Reminder reminder : reminders) {
					if (reminder.getReminderDateTime().isAfter(targetDateTime)
							|| reminder.getReminderDateTime().isEqual(targetDateTime)) {
						System.out.println("Reminder: " + reminder.getReminderText() + " on " + reminder
								.getReminderDateTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
						found = true;
					}
				}

				if (!found) {
					System.out.println("No reminders found for the specified date and time.");
				}

				validInput = true;
			} catch (Exception invalidInput) {
				System.out.println("Invalid input format. Please use the format YYYY-MM-DD HH:mm.");
			}
		} while (!validInput);

		scanner.close();
	}
}
