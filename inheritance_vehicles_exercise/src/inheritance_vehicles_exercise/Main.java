package inheritance_vehicles_exercise;

public class Main {

	public static void main(String[] args) {

		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		
		car.setBrand("BMW");
		car.setModel("320i");
		car.setYear(2019);
		car.setDoors(5);
		car.displayInfo();
		
		bicycle.setBrand("Peugeot");
		bicycle.setModel("W21");
		bicycle.setYear(2023);
		bicycle.setWheels(2);
		bicycle.displayInfo();
		
		
	}

}
