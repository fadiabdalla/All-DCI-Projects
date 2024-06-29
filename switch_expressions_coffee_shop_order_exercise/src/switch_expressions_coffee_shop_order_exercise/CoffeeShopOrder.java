package switch_expressions_coffee_shop_order_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeShopOrder {
	private static List<Coffee> cart = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to our Coffee Shop!");
		System.out.println("------------------------------");

		int choice;
		do {
			System.out.println("Menu:");
			System.out.println("1. Order");
			System.out.println("2. Show Cart");
			System.out.println("3. Exit");
			System.out.print("Please enter your choice number: ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1 -> order(scanner);
			case 2 -> showCart();
			case 3 -> System.out.println("Thank you for visiting! Goodbye.");
			default -> System.out.println("Invalid choice!");
			}
		} while (choice != 3);
	}

	public static void order(Scanner scanner) {
		System.out.println("Please enter your choice:");
		System.out.println("1. Espresso");
		System.out.println("2. Latte");
		System.out.println("3. Cappuccino");
		int drinkChoice = scanner.nextInt();

		switch (drinkChoice) {
		case 1 -> addToCart("Espresso", List.of("Small ($0.99)", "Medium ($1.99)", "Large ($2.49)"), scanner);
		case 2 -> addToCart("Latte", List.of("Small ($2.49)", "Medium ($3.49)", "Large ($3.99)"), scanner);
		case 3 -> addToCart("Cappuccino", List.of("Small ($2.49)", "Medium ($3.49)", "Large ($3.99)"), scanner);
		default -> System.out.println("Invalid coffee choice!");
		}
	}

	public static void addToCart(String name, List<String> sizes, Scanner scanner) {
		System.out.println("Available sizes for " + name + ":");
		for (String size : sizes) {
			System.out.println(size);
		}

		System.out.println("Please enter your size choice number:");
		int sizeChoice = scanner.nextInt();
		Coffee existingCoffee = findCoffeeInCart(name, sizeChoice);
		if (existingCoffee != null) {
			existingCoffee.incrementQuantity();
			System.out.println("Added 1 more " + name + " (" + existingCoffee.getSizeName(sizeChoice) + ") to cart!");
		} else {
			double cost = switch (sizeChoice) {
			case 1 -> name.equals("Espresso") ? 0.99 : 2.49;
			case 2 -> name.equals("Espresso") ? 1.99 : 3.49;
			case 3 -> name.equals("Espresso") ? 2.49 : 3.99;
			default -> {
				System.out.println("Invalid coffee size!");
				yield 0;
			}
			};
			cart.add(new Coffee(name, sizeChoice, cost));
			System.out.println("Added 1 " + name + " (" + getSizeName(sizeChoice) + ") to cart!");
		}
	}

	public static Coffee findCoffeeInCart(String name, int sizeChoice) {
		for (Coffee coffee : cart) {
			if (coffee.getName().equals(name) && coffee.getSizeChoice() == sizeChoice) {
				return coffee;
			}
		}
		return null;
	}

	public static void showCart() {
		if (cart.isEmpty()) {
			System.out.println("Your cart is empty.");
		} else {
			System.out.println("Your Cart:");
			for (Coffee coffee : cart) {
				System.out.println(coffee);
			}
			System.out.println("Total Cost: $" + calculateTotalCost());
		}
	}

	public static double calculateTotalCost() {
		return cart.stream().mapToDouble(Coffee::getTotalPrice).sum();
	}

	public static String getSizeName(int sizeChoice) {
		return switch (sizeChoice) {
		case 1 -> "Small";
		case 2 -> "Medium";
		case 3 -> "Large";
		default -> "Invalid Size";
		};
	}
}
