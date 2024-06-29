package upcasting_and_downcasting_vehicle_hierarchy_exercise;

public class Vehicle {  
	
	String brand;
	String model;
	int year;
	
	public void startEngine() {
		
		System.out.println("The vehicle is starting...");
		
	} 
	

	public static void main(String[] args) {

		
		
		// Upcasting
		Vehicle car = new Car();
		Vehicle motorcycle = new Motorcycle();
		
		
		car.startEngine();
		motorcycle.startEngine();
		
		
		// Downcasting
		
		Car c = (Car) car;
		Motorcycle m = (Motorcycle) motorcycle;
		
		System.out.println(c.numberOfDoors);
		System.out.println(m.engineDisplacement);
		
		
		
	}

}
