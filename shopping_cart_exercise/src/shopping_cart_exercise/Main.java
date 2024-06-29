package shopping_cart_exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		HashMap<String, Integer> items = new HashMap<>();
		HashMap<String, Double> itemPrices = new HashMap<>();

		itemPrices.put("Milk", 1.49);
		itemPrices.put("Bread", 0.99);
		itemPrices.put("Coffee", 3.49);

		String item;
		int count;
		int choice;

		System.out.println("Shopping Cart");
		System.out.println("--------------------------");
		do {
			System.out.println("Menu : ");
			System.out.println("1. Add item.");
			System.out.println("2. Display cart contents.");
			System.out.println("3. Calculate total price.");
			System.out.println("4. Exit.");

			choice = scanner.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Add item ");
				System.out.println("--------------------------");
				System.out.println("Enter the item's name : ");
				item = scanner.next();
				System.out.println("Enter the quantities : ");
				count = scanner.nextInt();
				items.put(item, count);
				System.out.println("Item added to the shopping Cart");

				break;

			case 2:

				System.out.println("Shopping Cart List");
				System.out.println("--------------------------");

				for (Map.Entry<String, Integer> retrievedItem : items.entrySet()) {

					System.out.println(retrievedItem.getKey() + " : " + retrievedItem.getValue());

				}

				break;

			case 3:
				System.out.println("Calculate total price");
				System.out.println("--------------------------");

				double totalPrice = 0;

				for (Map.Entry<String, Integer> retrievedItem : items.entrySet()) {
					String itemName = retrievedItem.getKey();
					int itemQuantity = retrievedItem.getValue();

					double itemPrice = itemPrices.get(itemName);
					totalPrice += itemQuantity * itemPrice;

				}

				System.out.println("Total Price: $" + totalPrice);

				break;

			case 4:
				System.out.println("Exiting...");

				break;
			default:
                System.out.println("Invalid choice. Please select a valid option.");
			}

		} while (choice != 4);

		scanner.close();

	}

}
