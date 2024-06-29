package recursionExercise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		int start = 1;
		System.out.println("Enter a positive number : ");

		int num = scanner.nextInt();

		print(num, start);

		scanner.close();
	}

	public static void print(int num , int start) {

		if (num >= start) {
			System.out.println(num);
			print( num +1 , start);
		} else {
			
			System.out.println("Printing complete!");
			
		}
	}
}
