package number_rang_validator_exercise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter  a number to check if it's a valid number or not :");

		int num = scanner.nextInt();

		if (num <= 50 && num >= 10) {

			System.out.println(num + " is a Valid number");

		} else {

			System.out.println(num + " is not a Valid number");
		}
		scanner.close();
	}

}
