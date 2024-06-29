package upcasting_and_downcasting_vehicle_hierarchy_exercise;

public class Car extends Vehicle {
	int numberOfDoors = 4;
	
	@Override
	public void startEngine() {

	System.out.println("The Car is starting...");
	
	}

}
