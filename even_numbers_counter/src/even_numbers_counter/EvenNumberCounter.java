package even_numbers_counter;

public class EvenNumberCounter {
	
	
	int limit;
	
	int x = 2;

	
	public void countAndDisplayEvens(int limit) {
		
		  if (limit < 2) {
	            System.out.println("Invalid input. Please provide a limit greater than or equal to 2.");
	            return;
	        }
		
	do {
		System.out.println(x);
		x = x+2;
		
		
	} while (x <= limit);
	
	

		
	}

}
