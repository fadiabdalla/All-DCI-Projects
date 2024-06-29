package date_time_age_calculator_exercise;

import java.time.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean validInput = false;

		do {

			System.out.println(" Enter your  birthdate in the format \"YYYY-MM-DD\" : ");

			String userInput = scanner.next();
			try {

				LocalDate userBD = LocalDate.parse(userInput);
				LocalDate currentDate = LocalDate.now();

				Period age = Period.between(userBD, currentDate);
				System.out.println("Your age is : " + age.getYears() + " Years");
				validInput = true;
			} catch (Exception invalidInput) {

				System.out.println("Invalid format input.");
			}
		} while (!validInput);

		scanner.close();
	}

}
