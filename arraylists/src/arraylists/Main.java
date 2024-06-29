package arraylists;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList <Integer> list = new ArrayList<>();
		
		// these items are indexed just like in arrays
		
		
		list.add(9);
		list.add(52);
		list.add(121);
		
		/*
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		
		list.remove(2); // remove(index);
		list.clear();
		 */

		
		//printing all the elements if the arraylist
		
		for (Integer n: list ) {
			System.out.println(n);
			
		}
	
	for(int i = 0; i<list.size(); i++ ) {
		
		Integer n = list.get(i);
	
		System.out.println(i + ": " + n);
	
	}
	
	
	
	
	}

}
