package java_linters;

public class Main {

	public static void main(String[] args) {

		// Code Quality Example

		int x = 10;
		int y = 20;
		int z; // Unused variable

		System.out.println("Sum: " + (x + y));
	}

	// Code Style Enforcement

	static public void method1() {
		int result = 0; // Condition formatting issue
		if (result > 0) {
			System.out.println("Positive");
		}
	}

	// Bug Detection
	public static void method2() {
		String str = null;
		System.out.println(str.length()); // Potential null pointer exception
	}
}
