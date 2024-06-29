package lambda_expression_calculator_exercise;

import java.util.Scanner;

@FunctionalInterface
interface Calculation {

	double calculate(double num1, double num2);
}

public class LambdaExercise {

	static double performOperation(double num1, double num2, Calculation operation) {
		return operation.calculate(num1, num2);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double number1;
		double number2;
		double result;
		Calculation addition = (num1, num2) -> num1 + num2;
		Calculation subtraction = (num1, num2) -> num1 - num2;
		Calculation division = (num1, num2) -> num1 / num2;
		Calculation multiplication = (num1, num2) -> num1 * num2;

		int choice;
		do {
			System.out.println("Calculator\n------------------- ");
			System.out.println("Please chose an operation: ");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Devision");
			System.out.println("4. Multiplication");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			System.out.println();

			switch (choice) {
			case 1:
				System.out.println("Addition\n ----------------------");
				System.out.println("Enter the first digit : ");
				number1 = scanner.nextDouble();
				System.out.println("Enter the second number: ");
				number2 = scanner.nextDouble();
				result = performOperation(number1, number2, addition);
				System.out.println(number1 + " + " + number2 + " = " + result);

				break;
			case 2:
				System.out.println("Subtracion\n ----------------------");
				System.out.println("Enter the first digit : ");
				number1 = scanner.nextDouble();
				System.out.println("Enter the second number: ");
				number2 = scanner.nextDouble();
				result = performOperation(number1, number2, subtraction);
				System.out.println(number1 + " - " + number2 + " = " + result);

				break;

			case 3:
				System.out.println("Division\n ----------------------");
				System.out.println("Enter the first digit : ");
				number1 = scanner.nextDouble();
				System.out.println("Enter the second number: ");
				number2 = scanner.nextDouble();
				result = performOperation(number1, number2, division);
				System.out.println(number1 + " ÷ " + number2 + " = " + result);
				break;

			case 4:
				System.out.println("Multiplication\n ----------------------");
				System.out.println("Enter the first digit : ");
				number1 = scanner.nextDouble();
				System.out.println("Enter the second number: ");
				number2 = scanner.nextDouble();
				result = performOperation(number1, number2, multiplication);
				System.out.println(number1 + " x " + number2 + " = " + result);
				break;
			case 5:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}
		} while (choice != 5);
		scanner.close();

	}

}
