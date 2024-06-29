package method_reference_exercise;

public class Main {

	static int addNumbers(int x, int y) {

		return x + y;
	}

	static int subtractNumbers(int x, int y) {

		return x - y;
	}

	static int multiplyNumbers(int x, int y) {

		return x * y;
	}

	static int performOperation(int x, int y, MathOperation operation) {

		return operation.execute(x, y);

	}

	public static void main(String[] args) {

		MathOperation addition = (x, y) -> addNumbers(x, y);

		MathOperation subtraction = Main::subtractNumbers;

		MathOperation multiplication = Main::multiplyNumbers;

		int x = 70;
		int y = 30;

		int result1 = performOperation(x, y, addition);
		int result2 = performOperation(x, y, subtraction);
		int result3 = performOperation(x, y, multiplication);

		System.out.println(" The addition result is : " + result1);
		System.out.println(" The subtraction result is : " + result2);
		System.out.println(" The multiplication result is : " + result3);

	}

}
