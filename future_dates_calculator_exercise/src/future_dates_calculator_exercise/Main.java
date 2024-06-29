package future_dates_calculator_exercise;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean validInput = false;

		do {

			System.out.println("Enter a starting date in the format \"YYYY-MM-DD.\" : ");
			String startingDate = scanner.next();
			
			System.out.println("Enter the number of days into the future: ");
			int num = scanner.nextInt();
			try {

				LocalDate date = LocalDate.parse(startingDate);
				LocalDate futureDate = date.plusDays(num);
				LocalDate currentDate = LocalDate.now();
				if (futureDate.isAfter(currentDate)) {
					System.out.println("Your future Date is : " + futureDate);
					validInput = true;
				}else {
					System.out.println("Your future Date is before today's date. Please enter a vaild Date.");

				}
			} catch (Exception invalidInput) {

				System.out.println("Invalid format input.");
			}
		} while (!validInput);

		scanner.close();
	}


		
	}


