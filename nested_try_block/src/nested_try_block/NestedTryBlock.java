package nested_try_block;

public class NestedTryBlock {

	public static void main(String[] args) {

		// outer try block
		try {

			// first inner try block
			try {
				int number = 70 / 0;
			}
			// catch block of the first inner try block
			catch (ArithmeticException e) {

				System.out.println(e);
			}
			// second inner try block
			try {
				int values[] = new int[10];
				values[11] = 10;
			}
			// catch block of the second inner try block
			catch (ArrayIndexOutOfBoundsException e) {

				System.out.println(e);
			}

			System.out.println("Another statement");

		}
		// catch block of outer try block

		catch (Exception e) {

			System.out.println("Super type Exception in outer catch block.");
		}

		System.out.println("rest of the code...");

	}

}
