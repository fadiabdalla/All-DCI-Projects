package rectangleCalculator;

import java.util.Scanner;

public class RectangleCalculator {

	public static void main(String[] args) {

		Calculator calculate = new Calculator();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the length :");
		double length = scanner.nextDouble();

		System.out.println("Enter the width :");
		double width = scanner.nextDouble();

		double area = calculate.calculateArea(length, width);
		System.out.println("The Area equals " + area);

		double perimeter = calculate.calculatePerimeter(length, width);
		System.out.println("The Perimeter equals " + perimeter);

	}

}
