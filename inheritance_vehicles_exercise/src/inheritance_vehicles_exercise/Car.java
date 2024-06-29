package inheritance_vehicles_exercise;

public class Car extends Vehicle {

	int doors;

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Number of doors of the car : " + doors);
	}
	

}
