package inheritance_vehicles_exercise;

public class Bicycle extends Vehicle {
	
	
	int wheels;

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Number of wheels of the bicycle : " + wheels);	
	}
	
	

}
