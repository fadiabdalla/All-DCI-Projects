package constructor_reference_exercise;

public class Car {
	private String make, model;
	private int year;

	public Car(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return "Car make: " + make + ", model: " + model + ", year: " + year;
	}

}
