package custom_exception_handling_age_verification_exercise;

import java.util.*;

public class AgeVerifier {

	static void ageValidator(int age) throws UnexpectedAgeException,UnderageException {

		if (age > 99 || age < 1) {

			throw new UnexpectedAgeException("Please enter your real age! between 1 and 99.");
			
		}else if (age >= 18) {

			System.out.println("Age verified! You are allowed to access the website.");

		}  else {

			throw new UnderageException("You are under 18 years and not allowed to access the website!");
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your age : ");

		try {

			int age = scanner.nextInt();
			ageValidator(age);

		} catch (UnexpectedAgeException e) {
			System.out.println("Error :" + e.getMessage());
		} catch (UnderageException e) {
			System.out.println("Error :" + e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter your age in numbers.");
		} catch (Exception e) {

			System.out.println("Error : Unexpected Error!");
		}

	}

}
