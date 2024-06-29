package functional_programming;
import java.util.function.Consumer;

import java.util.List;

public class Main {

	// Functional Interface is an interface that has one method in it.
	
	public static void main(String[] args) {

		var list = List.of("red", "blue", "pink");
		
		//Consumer Interface is a Functional Interface
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {

				System.out.print(t + " ");
				
			}
		}); 
		
		System.out.println();
		list.forEach(System.out::println);
		
		System.out.println();
		
		list.forEach((s) -> {
			
			System.out.print(s);
			System.out.print(" ");
			
		});
		
	}

}
