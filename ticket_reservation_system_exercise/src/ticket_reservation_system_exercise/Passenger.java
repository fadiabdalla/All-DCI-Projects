package ticket_reservation_system_exercise;

public class Passenger {

	private String passengerName;
	private SeatClass seatClass;
	private double ticketPrice;

	public Passenger(String passengerName, SeatClass seatClass, double ticketPrice) {
		super();
		this.passengerName = passengerName;
		this.seatClass = seatClass;
		this.ticketPrice = ticketPrice;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public SeatClass getSeatClass() {
		return seatClass;
	}

	public void setSeatClass(SeatClass seatClass) {
		this.seatClass = seatClass;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

}
