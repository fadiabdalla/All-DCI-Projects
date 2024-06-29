package day_of_the_week_calculator_exercise;

import java.util.Scanner;
import java.time.*;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean validInput = false;

		do {

			System.out.println(" Enter a date in the format \"YYYY-MM-DD\" : ");

			String userInput = scanner.next();
			try {

				LocalDate date = LocalDate.parse(userInput);
				System.out.println("The day is : " + date.getDayOfWeek());
				validInput = true;
			} catch (Exception invalidInput) {

				System.out.println("Invalid format input.");
			}
		} while (!validInput);

		scanner.close();
	}

}
