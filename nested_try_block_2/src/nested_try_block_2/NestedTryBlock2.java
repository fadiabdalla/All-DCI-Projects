package nested_try_block_2;

public class NestedTryBlock2 {

	public static void main(String[] args) {

		// outer try block
		try {
			
			// first inner try block
			try {
				
				// second inner try block
				try {
					
					int numbers[] = {1,2,3,4,5};
					System.out.println(numbers[10]);
					
				}catch (ArithmeticException e) {

					System.out.println("Arithmetic Exception (second inner try block)");
				}
			}
			catch (ArrayIndexOutOfBoundsException e) {

				System.out.println("Arithmetic Exception (first inner try block)");
			}
		}
		catch (Exception e) {

			System.out.println("Super type Exception (outer try block)");
		}
	}

}
