package ticket_booking_system_exercise;

public class User extends Thread {

	private String userName;
	private TicketBookingSystem tbs;

	// Constructor to initialize the user name and TicketBookingSystem instance
	public User(String userName, TicketBookingSystem tbs) {
		this.userName = userName;
		this.tbs = tbs;
	}

	// Run method to be executed when the thread starts
	@Override
	public void run() {

		// Attempt to book tickets three times
		for (int i = 0; i < 3; i++) {

			tbs.bookTicket(userName);

		}

	}

}
