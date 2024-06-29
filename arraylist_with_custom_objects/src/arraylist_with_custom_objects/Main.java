package arraylist_with_custom_objects;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Car> cars = new ArrayList<>();
		
		
		cars.add(new Car("Volkswagen"));
		cars.add(new Car("Mercedes"));
		cars.add(new Car("Volvo"));
		cars.add(new Car("BMW"));
		
		cars.set(2,new Car("Kia")); // set (index, element);
		
		for(Car car: cars) {
		System.out.println(car);
		}
		
		System.out.println();
	}
	

}
