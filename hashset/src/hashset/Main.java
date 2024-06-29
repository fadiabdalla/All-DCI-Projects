package hashset;

import java.util.HashSet;
import java.util.Set;

public class Main {


	public static void main(String[] args) {
		
		/*
		 * Java HashSet class implements the set interface.
		 * It stores unique objects. It will not store duplicates.
		 * You don't get an error, simply nothing happens, the element is discarded.
		 * HashSet doesn't store elements in particular order.
		 * There is no get method to access a particular index.
		 */

		
		Set <Integer> set = new HashSet<>();
		
		set.add(5);
		set.add(6);
		set.add(3);
		set.add(5);
		set.add(7);
		set.add(2);
		set.add(3);
		
		
		System.out.println(set);
		
		
		for(int numbers : set) {
			
			System.out.println(numbers);
		}
		
		System.out.println(set.contains(7));
		
		
		
		
	}
	
}
