package stream_collectors;

import java.util.List;
import java.util.stream.Collectors;


public class Main {

	public static void main(String[] args) {

		var colors = List.of("Red", "Blue", "Purple", "White", "Yellow", "Green", "Black");
		
		
		var list = colors.stream().map(Color::new)
				.collect(Collectors.toList()); // terminal operation "It must be in the end of syntax"
		
	
		for(var color : list) {
			System.out.println(color.getClass());
			System.out.println(color);
		}
				
		
		
		
	}

}
