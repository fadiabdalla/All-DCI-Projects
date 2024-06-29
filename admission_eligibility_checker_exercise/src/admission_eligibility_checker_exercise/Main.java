package admission_eligibility_checker_exercise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your GPA : ");

		double gpa = scanner.nextDouble();

		System.out.println("Please enter your SAT score : ");

		int sat = scanner.nextInt();

		boolean eligible = (gpa >= 3.5) && (sat >= 1500);

		if (eligible) {

			System.out.println("You are eligible for admission");

		} else {

			System.out.println("You are not eligible for admission");

		}
		scanner.close();

	}

}
