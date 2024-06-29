package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		/*
		 - ArrayList uses an Array to store its elements, while LinkedList stores
		  its elements in a doubly-linked-list.
		 - ArrayList is used more in data reading scenarios.
		 - LinkedList is used more for data addition or deletion.
		 - LinkedList and ArrayList are two different implementations of the List interface.
		 
		 
		 Most common methods of LikedList:
		 
		 get(index);
		 getFirst();
		 getLast();
		 add(element);
		 add(index, element);
		 addFirst(element);
		 addLast(element);
		 remove(index);
		 removeFirst();
		 removeLast();
		 clear();
		 
		 */
		
		
		
		LinkedList <String> list = new LinkedList<>();
		
		list.add("Item 1");
		list.add("Item 2");
		list.add("Item 3");
		
		for (String item : list) {
			
			System.out.println(item);
			
		}
		
		for(int i = 0; i<list.size(); i++) {
			
			String s = list.get(i);
			
			System.out.println(i + ": " + s);
			
		}
		
		List<Integer> numbers1 = new ArrayList<>(); 
		List<Integer> numbers2 = new LinkedList<>(); 
		numbers1 = numbers2;
		
		
		numbers2.add(3);
		numbers2.add(53);
		numbers2.add(125);
		
		showList(numbers1);
		
		
	}
	
	public static void showList (List<Integer> list) {
		
		for (Integer num : list) {
			
			System.out.println(num);
			
			
		}
		
		
	}

}
