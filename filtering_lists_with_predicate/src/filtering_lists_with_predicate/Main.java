package filtering_lists_with_predicate;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		var values = new ArrayList<>(List.of(3, 5, 6, 8, 20));
		
		
		values.add(9); //The of() will return a unmodifiable list

		values.removeIf(n -> n < 6);
		values.forEach(System.out::println);


		
	}

}
