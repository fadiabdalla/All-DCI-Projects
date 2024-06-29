package ticket_reservation_system_exercise;

public class Main {

	public static void main(String[] args) {
		Flight flight = new Flight();

		flight.reserveSeat("Fadi Georgos", SeatClass.FIRST_CLASS);
		flight.reserveSeat("Sarah Samuel", SeatClass.BUSINESS_CLASS);
		flight.reserveSeat("Mia Marlon", SeatClass.ECONOMY_CLASS);

		flight.displayPassengerList();

		flight.cancelReservation("Alice Smith");

		// total revenue
		double totalRevenue = flight.totalRevenue();
		System.out.println("The total revenue is: $" + totalRevenue);

	}

}
