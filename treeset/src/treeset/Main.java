package treeset;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		//TREESET with Strings

		
		Set<String> colors = new TreeSet<>();
		
		
		colors.add("Black");
		colors.add("Grey");
		colors.add("Brown");
		colors.add("Yellow");
		
		System.out.println(colors.contains("Grey"));
		
		for ( String color : colors) {
			
			System.out.println(color);
		}
		
		// TREESET with Integers
		
		
		TreeSet<Integer> values = new TreeSet<>();
		
		
		values.add(12);
		values.add(1);
		values.add(9);
		values.add(25);
		
		for(int value : values) {
			
			
			System.out.println(value);
		}
		
		
		// TREESET with custom Objects
		
		
		TreeSet<Person> people = new TreeSet<>();
		
		people.add(new Person("Fadi", 43));
		people.add(new Person("Mary", 34));
		people.add(new Person("Bob", 52));
		people.add(new Person("Stella", 23));
		
		
		for(Person person : people) {
			
			
			System.out.println(person);
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	
		
		
	}

}
