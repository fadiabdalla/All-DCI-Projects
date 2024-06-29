package handling_multiple_exceptions_exercise;

import java.util.*;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {

		int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter an index to get the value:");

		try {
			int userInput = scanner.nextInt();
			System.out.println(numbers[userInput]);
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter an integer number.");
		} catch (ArithmeticException e) {
			System.out.println("Invalid input (Arithmetic Exception).");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid input. The index you entered is out of array's bound.");
		} catch (Exception e) {
			System.out.println("Invalid input. A super type Exception occurred.");
		}
	}
}
