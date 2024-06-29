package transforming_streams;

import java.util.List;

public class Main {

	public static void main(String[] args) {

		var colors = List.of("Red", "Blue", "Purple", "White", "Yellow", "Green", "Black");
		
		// colors.stream().map(c -> new Color(c)); we can use lambdas because map takes Function parameter.
		colors.stream().map(Color::new).forEach(System.out::println);
		
		long totalCount = colors.stream().count();
		System.out.println("Number of the elements in the list: " + totalCount);
		
	}

}
