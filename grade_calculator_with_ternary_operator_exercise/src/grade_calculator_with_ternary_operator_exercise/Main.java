package grade_calculator_with_ternary_operator_exercise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please Enter your Grade : ");

		int grade = scanner.nextInt();

		String gradeLetter = (grade >= 90 && grade <= 100) ? "A!"
				: (grade >= 80 && grade <= 100) ? "B!"
						: (grade >= 70 && grade <= 100) ? "C!"
								: (grade >= 60 && grade <= 100) ? "D!"
										: (grade < 60 && grade >= 0) ? "F!"
												: "ERROR! the grade you entered is not between 0 - 100.";

		System.out.println(grade + " = " + gradeLetter);

	}

}
