package date_and_time_reminders_exercise;

import java.time.*;

public class Reminder {

	private String reminderText;
	private LocalDateTime reminderDateTime;

	public Reminder(String reminderText, LocalDateTime reminderDateTime) {
		super();
		this.reminderText = reminderText;
		this.reminderDateTime = reminderDateTime;
	}

	public String getReminderText() {
		return reminderText;
	}

	public LocalDateTime getReminderDateTime() {
		return reminderDateTime;
	}

}
