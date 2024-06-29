package chat_bot;

import java.util.Scanner;

public class Billing {
Scanner scanner = new Scanner(System.in);
	
	public void billing () {
		
		System.out.println("1. Payment Methods");
		System.out.println("2. Billing Discrepancies");
		System.out.println("3. Subscription and Renewal");
		System.out.print("Enter your choice (1, 2, or 3): ");
		int categoryChoice = scanner.nextInt();
		

		if (categoryChoice == 1) {
			// Payment Methods
			System.out.println("Payment Methods:");
			System.out.println("1. How can I update my payment methods?");
			System.out.println("2. What payment methods do you accept?");
			System.out.println("3. Can I add multiple payment methods to my account?");
			System.out.print("Enter your choice (1, 2, or 3): ");
			int subCategoryChoice = scanner.nextInt();
			

			if (subCategoryChoice == 1) {
				System.out.println("You can update your payment methods in your account settings.");
			} else if (subCategoryChoice == 2) {
				System.out.println("We accept credit cards, PayPal, and bank transfers.");
			} else if (subCategoryChoice == 3) {
				System.out.println("Yes, you can add multiple payment methods to your account.");
			} else {
				System.out.println("Invalid choice.");
			}
		} else if (categoryChoice == 2) {
			// Billing Discrepancies
			System.out.println("Billing Discrepancies:");
			System.out.println("1. I found a discrepancy in my bill, what should I do?");
			System.out.println("2. How can I dispute a charge on my account?");
			System.out.println("3. Can you help me understand a specific charge on my invoice?");
			System.out.print("Enter your choice (1, 2, or 3): ");
			int subCategoryChoice = scanner.nextInt();
			

			if (subCategoryChoice == 1) {
				System.out.println("Please contact our billing department for assistance.");
			} else if (subCategoryChoice == 2) {
				System.out.println("To dispute a charge, please fill out our online dispute form.");
			} else if (subCategoryChoice == 3) {
				System.out.println("Certainly, please provide the details of the charge, and we will assist you.");
			} else {
				System.out.println("Invalid choice.");
			}
		} else if (categoryChoice == 3) {
			// Subscription and Renewal
			System.out.println("Subscription and Renewal:");
			System.out.println("1. How do I cancel my subscription?");
			System.out.println("2. When will my subscription renew?");
			System.out.println("3. Is there an auto-renewal option for my subscription?");
			System.out.print("Enter your choice (1, 2, or 3): ");
			int subCategoryChoice = scanner.nextInt();
			

			if (subCategoryChoice == 1) {
				System.out.println("You can cancel your subscription in your account settings.");
			} else if (subCategoryChoice == 2) {
				System.out.println("Your subscription will renew on the specified renewal date.");
			} else if (subCategoryChoice == 3) {
				System.out.println("Yes, there is an auto-renewal option available for your subscription.");
			} else {
				System.out.println("Invalid choice.");
			}
		} else {
			System.out.println(
					"Invalid category choice. Please choose 1 for Payment Methods, 2 for Billing Discrepancies, or 3 for Subscription and Renewal.");
		}
	}
}
