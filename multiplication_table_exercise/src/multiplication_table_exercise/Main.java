package multiplication_table_exercise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a Number : ");
		int n = scanner.nextInt();

		System.out.println("The Multiplication Table for " + n + " : ");

		for (int x = 1; x <= 10; ++x) {

			System.out.println(n + " x " + x + " = " + (n * x));

		}
		
		scanner.close();

	}

}
