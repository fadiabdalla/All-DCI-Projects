package ternary_operator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

	System.out.println("Enter temp in celsius : ");
		
	int temp = scanner.nextInt();
	int x = 3;
	
	String weather = (temp >= 40) ? "Very hot!" : (temp >= 25) ? "Hot!" : (temp >= 0) ? "Cold!" : "Freazing Cold!";
	
		System.out.println(weather);
	
	}

}
