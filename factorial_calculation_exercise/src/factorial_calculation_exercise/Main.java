package factorial_calculation_exercise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a positive number n : ");
		
		int n = scanner.nextInt();
		long factorial= 1;
		
		
		if (n < 0) {
            
			System.out.println("Factorial is not defined for negative numbers.");
       
			return;
		}
    
		
		
		for (int x = 1;x <= n;x++) {
			
			factorial *= x;
			
		}
		
		System.out.println("Factorial of " + n + " is: " + factorial);
    
		
		scanner.close();
		
	}

}
