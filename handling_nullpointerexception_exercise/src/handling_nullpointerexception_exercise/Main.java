package handling_nullpointerexception_exercise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Inventory inventory = new Inventory();

		int choice;
		do {
			System.out.println("Menu:");
			System.out.println("1. Add Product");
			System.out.println("2. Get Product Details");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter Product ID: ");
				int productId = scanner.nextInt();
				scanner.nextLine(); 
				System.out.print("Enter Product Name: ");
				String productName = scanner.nextLine();
				System.out.print("Enter Product Price: ");
				double productPrice = scanner.nextDouble();
				scanner.nextLine(); 

				Product newProduct = new Product(productId, productName, productPrice);
				inventory.addProduct(newProduct);
				System.out.println("Product added to inventory.");
				break;

			case 2:
				System.out.print("Enter Product ID: ");
				int searchProductId = scanner.nextInt();
				String details = inventory.getProductDetails(searchProductId);
				System.out.println(details);
				
				break;

			case 3:
				System.out.println("Exiting program.");
				scanner.close();
				break;

			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}
		} while (choice != 3);
		
		scanner.close();
	}
}