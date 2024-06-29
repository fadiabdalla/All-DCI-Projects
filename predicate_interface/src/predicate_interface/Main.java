package predicate_interface;

import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {

		
		Predicate<String> p1 = new Predicate<>() {

			@Override
			public boolean test(String t) {	
				return t.length() < 5;
			}
		};
		
		System.out.println(p1.test("Apple"));
		
		Predicate<String> p2 = s ->s.length() < 5;
			
			
			System.out.println(p2.test("Apple"));
			System.out.println(p2.test("Pear"));
			
	
	}

}
