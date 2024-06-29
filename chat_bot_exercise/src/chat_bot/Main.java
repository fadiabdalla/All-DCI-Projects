package chat_bot;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Billing billing = new Billing();
		Delivery delivery = new Delivery();
		Product product = new Product();
		boolean run = true;
		System.out.println("Welcome to DamaStore customer support! How can I assist you today?");
		while (run) {
			System.out.println("Please choose a problem category: ");
			System.out.println("1. Product-related issue");
			System.out.println("2. Billing-related issue");
			System.out.println("3. Delivery issue");
			System.out.println("4. Exit");
			System.out.print("Enter your choice (1, 2, 3, or 4): ");
			int categoryChoice = scanner.nextInt();

			switch (categoryChoice) {
			case 1:
				product.product();
				
				break;

			case 2:
				billing.billing();
				break;

			case 3:
				
				delivery.delivery();

				break;
			case 4:
				System.out.println("Thank you for contacting DamaStore customer support. Have a great day!");
				run = false;
				break;

			default:
				System.out.println(
						"Invalid choice. Please choose 1 for Product, 2 for Billing, or 3 for Delivery issues.");
			}
			
			

	
		}
	}
}