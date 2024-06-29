package game;

import java.util.Scanner;
public class UserInput {
	
	static Scanner scanner = new Scanner(System.in);
	public int inputRows() {
	    int inputRow = 0;
	    boolean validInput = false;
	    do {
	        try {
	            System.out.println("Please select the row (A number between 1-3): ");
	            String input = scanner.nextLine();
	            inputRow = Integer.parseInt(input) - 1;
	            if (inputRow >= 0 && inputRow <= 2) {
	                validInput = true;
	            } else {
	                System.out.println("Invalid input. Please enter a number between 1-3.");
	            }
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid input. Please enter a number.");
	        }
	    } while (!validInput);
	    return inputRow;
	}

	
	public int inputColumns() {
		Scanner scanner = new Scanner(System.in);
		// Creating the variables
		int inputColumn = 0;
		try {
			// Taking input for column
			do {
				System.out.println("\nPlease select the column (A number between 1-3: ");
				inputColumn = scanner.nextInt();
				scanner.nextLine();
				
				// Subtracting 1
				inputColumn -= 1;
				
			} while (inputColumn > 2 || inputColumn < 0);
		} catch (IllegalArgumentException e) {
			System.err.println("Wrong input. You should input a number between 1-3.");
		} finally {
			
		}return inputColumn;
	}
}












