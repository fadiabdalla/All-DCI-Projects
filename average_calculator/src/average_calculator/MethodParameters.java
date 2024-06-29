package average_calculator;

import java.util.Scanner;

public class MethodParameters {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number :");
		
		double a = scanner.nextDouble();
		
		
		
		System.out.println("Enter the second number :");
		
		double b = scanner.nextDouble();
		
		
		
		System.out.println("Enter the third number :");
		
		double c = scanner.nextDouble();
		
		double average =  calculate( a, b, c);
		
		
		System.out.println("The average for the three given numbers is _: " + average);
		
	}

	
	

	static double calculate (double a, double b, double c) {
		
		double z = (a+b+c)/3;
		return z;
	
		
		
	}
}
