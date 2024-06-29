package random_class;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		// Create an instance of Random class
		Random random = new Random();
		
		// Generate random integer in range 0 to 999
		
		int randomNum1= random.nextInt(1000);
		int randomNum2= random.nextInt(1000);
		
				System.out.println(randomNum1);
				System.out.println(randomNum2);
				
				
				
				
				// Generate random doubles
				
				
				
				double randomDecimalNum1 = random.nextDouble(10.0);
				double randomDecimalNum2 = random.nextDouble(10.0);
				
				
				System.out.println(randomDecimalNum1);
				System.out.println(randomDecimalNum2);
				
				
	}

}
