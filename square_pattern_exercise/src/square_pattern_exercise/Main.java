package square_pattern_exercise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the square size : ");
		int n = scanner.nextInt();

		for (int x = 1; x <= n; x++) {

			for (int y = 1; y <= n; y++) {

				System.out.print("* ");
			}

			System.out.println();
		}

	}

}
