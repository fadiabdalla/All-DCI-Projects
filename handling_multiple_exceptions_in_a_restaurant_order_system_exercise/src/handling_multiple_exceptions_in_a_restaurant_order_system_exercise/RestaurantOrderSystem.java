package handling_multiple_exceptions_in_a_restaurant_order_system_exercise;

import java.util.*;

public class RestaurantOrderSystem {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List<MenuItem> items = new ArrayList<>();

		MenuItem item1 = new MenuItem("Sushi", 15);
		MenuItem item2 = new MenuItem("Pizza", 20);
		MenuItem item3 = new MenuItem("Falafel", 10);
		MenuItem item4 = new MenuItem("Döner", 8);
		MenuItem item5 = new MenuItem("Nudels", 13);

		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		items.add(item5);

		int choice;
		double totalPrice = 0;

		do {
			System.out.println("\nRestaurant Order System Menu:");
			System.out.println("1. View Menu");
			System.out.println("2. Place an Order");
			System.out.println("3. Calculate Total Bill");
			System.out.println("4. Quit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			try {
				switch (choice) {
				case 1:
					displayMenu(items);
					break;

				case 2:
					displayMenu(items);
					System.out.print("Enter the item number: ");
					int itemNumber = scanner.nextInt();
					MenuItem selectedItem = items.get(itemNumber - 1);

					System.out.print("Enter the quantity: ");
					try {
						int quantity = scanner.nextInt();
						totalPrice += selectedItem.getPrice() * quantity;
						System.out.println("Added " + quantity + " " + selectedItem.getName() + "(s) to your order.");
					} catch (InputMismatchException e) {
						throw new InputMismatchException("Invalid quantity input. Please enter a valid integer.");
					}
					break;

				case 3:
					System.out.println("Total Price: $" + totalPrice);
					break;

				case 4:
					System.out.println("Exiting...");
					break;

				default:
					System.out.println("Invalid choice. Please try again.");
					break;
				}
			} catch (InputMismatchException | IndexOutOfBoundsException e) {
				System.out.println("Invalid input. Please enter a valid number or item number.");
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (choice != 4);

		scanner.close();
	}

	private static void displayMenu(List<MenuItem> items) {
		System.out.println("Name    Price");
		for (int i = 0; i < items.size(); i++) {
			 System.out.printf("%d. %-10s $%.2f%n", (i + 1), items.get(i).getName(), items.get(i).getPrice());
	    }
		}
	}

