package multiplication_quiz_exercise;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		

		Scanner scanner = new Scanner(System.in);

		Random random = new Random();

		int x = random.nextInt(10) + 1;
		int y = random.nextInt(10) + 1;
		int z = x*y;
		
		System.out.println("Solve this multiplication question.");
		System.out.print(x + " x " + y + " = " );

		int userInput = scanner.nextInt();
		
		while (userInput != z) {
			
			System.out.println("Your answer is wrong! try again");
			System.out.print(x + " x " + y + " = " );
			userInput = scanner.nextInt();
		}
		
			System.out.println("Great job! Your answer is correct. " + x + " x " + y + " = " + userInput);
			
		

		
		scanner.close();
		
	}

}
