package constructor_reference_exercise;

@FunctionalInterface
interface CarFactory {

	Car execute(String make, String model, int year);

}

public class Main {

	static Car createCar(String make, String model, int year, CarFactory cf) {

		return cf.execute(make, model, year);
	}

	public static void main(String[] args) {

		CarFactory cf = Car::new;

		Car car = createCar("Mercedes", "G-class", 2023, cf);

		System.out.println(car);

	}

}
