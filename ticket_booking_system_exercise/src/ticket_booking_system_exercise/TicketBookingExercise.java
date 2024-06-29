package ticket_booking_system_exercise;

public class TicketBookingExercise {

	public static void main(String[] args) {
		// Create a TicketBookingSystem instance with 35 available tickets
		TicketBookingSystem tbs = new TicketBookingSystem(35);

		// Create User instances with different names and the same TicketBookingSystem
		// instance
		User user1 = new User("Fadi", tbs);
		User user2 = new User("Frank", tbs);
		User user3 = new User("Emma", tbs);
		User user4 = new User("Daisy", tbs);
		User user5 = new User("Sam", tbs);

		// Start all User threads to simulate concurrent booking attempts
		user1.start();
		user2.start();
		user3.start();
		user4.start();
		user5.start();

		try {
			// Wait for all User threads to finish executing
			user1.join();
			user2.join();
			user3.join();
			user4.join();
			user5.join();
		} catch (InterruptedException e) {
			// Handle InterruptedException if it occurs
			System.out.println(e.getMessage());
		}
	}
}
