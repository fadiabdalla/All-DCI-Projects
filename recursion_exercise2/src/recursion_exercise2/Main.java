package recursion_exercise2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a positive number : ");

		int num = scanner.nextInt();
		scanner.close();

		if (num >= 1) {

		  print(num);

		}

		System.out.println("Countdown complete!");

	}

	public static void print(int num) {

		if (num >= 1) {
			System.out.println(num);
			print(num - 1);
		}

	}

}
