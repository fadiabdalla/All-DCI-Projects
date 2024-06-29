package handling_arrayindexoutofboundsexception_exercise;

public class MultiCatchBlock {

	public static void main(String[] args) {

		try {
			
			int numbers[] = new int[6];
			
			numbers[6] = 70/0;
			
		}catch (ArithmeticException e) {
			
			System.out.println("ArithmeticException is thrown.");
			
		}catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("ArrayIndexOutOfBoundsException is thrown.");
			
		}catch (Exception e) {
			
			System.out.println("Super type Exception is thrown.");
			
		}
	
	
		System.out.println("The rest of the code.");
	
	}

}
