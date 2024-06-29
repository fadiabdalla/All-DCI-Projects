package singlton_design_pattern;

/*
 * Singleton class - means a class can have only one instance.
 * 
 * 
 */
class Car{
	
	static Car car = new Car(); //Step 1
	
	private Car() { // Step 2
		System.out.println("Instance created. ");
		
	}
	
	public static Car getInstance() { // Step 3
		
		return car;
	}
	
}
public class Main {

	public static void main(String[] args) {

	Car.getInstance();
	
	
		
		
	}

}
