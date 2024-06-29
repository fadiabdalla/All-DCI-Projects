package shapeAreaCalculator;

public class Calculator {

	double calculateArea(double value) {
		return Math.PI * value * value;
	}

	double calculateArea(float length, float width) {
		return length * width;
	}

	double calculateArea(double base, double height) {
		return 0.5 * base * height;
	}

}
