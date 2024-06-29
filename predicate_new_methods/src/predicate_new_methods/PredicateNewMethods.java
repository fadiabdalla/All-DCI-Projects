package predicate_new_methods;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNewMethods {
	
	public static boolean isEven(Integer number) {
		
		return number%2 ==0;
	}
	
	
	public static void main(String[] args) {
		
		
		List<Integer> numbers = List.of(1,4,6,7,39,60);
		
		Predicate<Integer> evenNumbers = number -> number % 2 == 0;
		
		//numbers.stream().filter(evenNumbers.negate()).forEach(System.out::println);
		
		//numbers.stream().filter(PredicateNewMethods::isEven).forEach(System.out::println);
		
		  numbers.stream().filter(Predicate.not(PredicateNewMethods::isEven)).forEach(System.out::println);
		
		
		
	}

}
