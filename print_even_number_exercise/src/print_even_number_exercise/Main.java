package print_even_number_exercise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the starting number : ");

		int start = scanner.nextInt();

		System.out.println("Enter the ending number : ");

		int end = scanner.nextInt();
		

		System.out.println("The Even numbers between " + start + " and " + end + " are :");
		

		for (int x = start; x < end; ++x) {

			if (x % 2 == 0) {

				System.out.println(x);

			}
		}

		scanner.close();
	}

}
