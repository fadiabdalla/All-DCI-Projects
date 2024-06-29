package chat_bot;

import java.util.Scanner;

public class Product {
	Scanner scanner = new Scanner(System.in);
	
	public void product  () {
		System.out.println("1. Product information");
		System.out.println("2. Product damage ");
		System.out.println("3. Product complainment ");
		System.out.println("Enter your choice (1, 2, or 3.)");
		int  categoryChoice = scanner.nextInt();
		

			if (categoryChoice == 1) {
				System.out.println("Product is avaible to purshe fom your area");
			} else if (categoryChoice == 2) {
				System.out.println("If product damage please full form to refund it.");
			} else if (categoryChoice == 3) {
				System.out.println("Didn't setsfied from product? You can also send it back..");
	}
			
}
}


