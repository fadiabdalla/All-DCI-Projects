package hashset_with_custom_objects;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Set<Vehicle> cars = new HashSet<>();
		
		
		cars.add(new Vehicle (01,"Audi"));
		cars.add(new Vehicle (02,"Mercedes"));
		cars.add(new Vehicle (03,"BMW"));
		cars.add(new Vehicle (04,"Volkswagen"));
		cars.add(new Vehicle (05,"Toyota"));
		cars.add(new Vehicle (06,"Ford"));
		
		
		for(Vehicle car : cars) {
			
			
			System.out.println(car);
		}
		
		
		
	}

}
