package discount_calculator_ternary_operator_exercise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the order amount please");
		double amount = scanner.nextDouble();
		double discount = amount / 10;
		double discountedPrice = amount - discount;

		String finalPrice = (amount >= 100)
				? ("you got a 10% discount (" + discount + " Euro) and the final price is :" + discountedPrice)
				: ("Sorry you have no discount and your Final Price is : " + amount);

		System.out.println(finalPrice);
		
		scanner.close();

	}

}
