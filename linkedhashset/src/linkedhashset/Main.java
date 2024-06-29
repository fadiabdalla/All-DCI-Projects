package linkedhashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		
		Set<String> colors = new LinkedHashSet<>();
		
		colors.add("White");
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Black");
		
		
		
		System.out.println(colors.contains("Green"));
		
		
		
		for(String color : colors) {
			
			System.out.println(color);
			
		}
		
		System.out.println(colors);
		
	}

}
