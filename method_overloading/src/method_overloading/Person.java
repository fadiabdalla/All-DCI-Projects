package method_overloading;

public class Person {

	void greet () {
		
		System.out.println("Hello");
		
	}
	
	void greet (String name) {
		
		System.out.println("HEllo " + name);
	}
	
	void greet(int height) {
		
		System.out.println("Hello");
		if(height > 190) {
			
			System.out.println("You are tall!");
		}
	}
		
		void greet(String name, int height) {
			
			System.out.println("Hello");
			if(height > 190) {
				
				System.out.println("You are tall!");
			}
	}
	
}
