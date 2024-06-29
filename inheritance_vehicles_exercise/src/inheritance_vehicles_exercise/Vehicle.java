package inheritance_vehicles_exercise;

public class Vehicle {

	String brand;
	String model;
	int year;
	
	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public void setBrand(String brand) {
		
		this.brand = brand;
		
	}
	
	public void setModel(String model) {
		
		this.model = model;
		
	}
	
	
	public void setYear(int year) {
		
		this.year = year;
	}
	public void displayInfo() {
		
		System.out.println("Brand : " + brand + ".");
		System.out.println("Model : " + model + ".");
		System.out.println("Year : " + year + ".");
		
	} 
	
}
