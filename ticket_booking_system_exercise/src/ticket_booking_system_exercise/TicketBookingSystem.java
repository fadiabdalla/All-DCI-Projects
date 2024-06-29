package ticket_booking_system_exercise;

public class TicketBookingSystem {

	private int totalTickets;

	// Constructor to initialize the total number of tickets
	public TicketBookingSystem(int totalTickets) {

		this.totalTickets = totalTickets;
	}

	// Method to book a ticket and update the totalTickets count
	public synchronized void bookTicket(String name) {
		if (totalTickets > 0) {
			totalTickets -= 1;

			System.out.println(name + " has booked a Ticket successfully!" + "\n Tickets remaining : " + totalTickets);

		} else {

			System.out.println("Sorry " + name + " the Ticket has not been booked! No More Tickets Avaliabe.");
		}

	}

	public void getTotalTickets() {
		System.out.println("Available Tickets : " + totalTickets);
		;
	}
}
