package type_casting_weight_conversion_exercise;

import java.util.Scanner;

public class WeightConverter {

	static int convertKiloToGram(double weight) {

		return (int) (weight * 1000);
	}

	static double convertGramToKilo(double weight) {

		return weight / 1000;
	}

	static double convertPoundsToOunces(double weight) {

		return weight * 16;
	}

	static double convertOuncesToPoundsOunces(double weight) {

		return weight / 16;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Weight Converter kg <=> g - lb <=> oz ");
		System.out.println("Enter the weight value: ");
		double weight = scanner.nextDouble();

		System.out.println("Enter the source weight unit (e.g., kg, g, lb, oz): ");
		String sourceUnit = scanner.next().toLowerCase();

		System.out.println("Enter the target weight unit (e.g., kg, g, lb, oz): ");
		String targetUnit = scanner.next().toLowerCase();

		double convertedWeight;

		if (sourceUnit.equals("kg") && targetUnit.equals("g")) {
			System.out.println(weight + "kg = " + convertKiloToGram(weight) + "g");
		} else if (sourceUnit.equals("g") && targetUnit.equals("kg")) {
			System.out.println(weight + "g = " + convertGramToKilo(weight) + "kg");
		} else if (sourceUnit.equals("lb") && targetUnit.equals("oz")) {
			System.out.println(weight + "lb = " + convertPoundsToOunces(weight) + "oz");
		} else if (sourceUnit.equals("oz") && targetUnit.equals("lb")) {
			System.out.println(weight + "oz = " + convertOuncesToPoundsOunces(weight) + "lb");
		} else {
			System.out.println("Invaild input.");
			return;
		}

		scanner.close();

	}

}
