package ticket_reservation_system_exercise;

import java.util.ArrayList;
import java.util.List;

public class Flight {

	List<Passenger> passengers;

	public Flight() {

		this.passengers = new ArrayList<>();

	}

	public double ticketPrice(SeatClass seatClass) {
		double price = 0;
		switch (seatClass) {
		case FIRST_CLASS:
			price = 2000;
			break;
		case BUSINESS_CLASS:
			price = 1500;
			break;
		case ECONOMY_CLASS:
			price = 1000;
			break;
		}
		return price;
	}

	public void reserveSeat(String passengerName, SeatClass seatClass) {

		double price = ticketPrice(seatClass);

		Passenger passenger = new Passenger(passengerName, seatClass, price);
		passengers.add(passenger);
		System.out.println("The Seat was reserved successfully!");

	}

	public void cancelReservation(String passengerName) {

		for (Passenger passenger : passengers) {

			if (passenger.getPassengerName().equals(passengerName)) {

				passengers.remove(passenger);
				System.out.println("The Seat was canceled successfully!");
			}
		}

	}

	public void displayPassengerList() {
		System.out.println("Passenger List:");
		for (Passenger passenger : passengers) {
			System.out.println("Name: " + passenger.getPassengerName() + ", Class: " + passenger.getSeatClass()
					+ ", Ticket Price: $" + passenger.getTicketPrice());
		}
	}

	public double totalRevenue() {
		double totalRevenue = 0;
		for (Passenger passenger : passengers) {
			totalRevenue += passenger.getTicketPrice();
		}
		return totalRevenue;
	}
}
