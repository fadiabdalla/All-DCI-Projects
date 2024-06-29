package chat_bot;

import java.util.Scanner;

public class Delivery {

	Scanner scanner = new Scanner(System.in);

	public void delivery() {
		System.out.println("Delivery:");
		System.out.println("1. How can I track my order?");
		System.out.println("2. What are the available shipping options?");
		System.out.println("3. How long does delivery usually take?");
		System.out.print("Enter your choice (1, 2, or 3): ");
		int subCategoryChoice = scanner.nextInt();
		

		if (subCategoryChoice == 1) {
			System.out.println(
					"You can track your order in your account dashboard or use the provided tracking number on our website.");
		} else if (subCategoryChoice == 2) {
			System.out.println(
					"We offer standard, expedited, and express shipping options. You can choose the one that suits your needs during checkout.");
		} else if (subCategoryChoice == 3) {
			System.out.println(
					"Delivery timeframes vary based on your location and the chosen shipping option. Standard shipping usually takes 3-5 business days.");
		} else {
			System.out.println("Invalid choice.");
		}
		
	}
}
