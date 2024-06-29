package while_loops;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		
		int value = 0;
		
		while (value < 10) {
			System.out.println(value);
			value++;
			
			
		}
		
		
		Scanner scanner = new Scanner (System.in);
		
		/*
		System.out.println("Please enter a number: ");
		int number = scanner.nextInt();
		
		
		while(number != 5) {
			
			System.out.println("\"Please enter a number: ");
			number = scanner.nextInt();
			
	
		}
		 */

		int number = 0;
		
		do {
			System.out.println("please enter a number: ");
			
			number = scanner.nextInt();
		}
		while (number != 5);
		
		System.out.println("Got 5 !");
		
		
	}

}
