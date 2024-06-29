package functional_programming_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }
}

class Inventory {
    private List<Product> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProducts() {
        System.out.println("Inventory:");
        products.forEach(product -> System.out.println(
                product.getName() + " :\n- Price: " + product.getPrice() + "\n- Quantity: " + product.getQuantity()));
    }

    public double calculateAveragePrice() {
        double average = products.stream()
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0);
        System.out.println("Average price of products: " + average);
        return average;
    }

    public void updatePrices(double percentageIncrease) {
        updateProducts(product -> true, p -> p.getPrice() * (1 + percentageIncrease / 100));
    }

    public void updatePrices2(double percentageDecrease) {
        updateProducts(product -> true, p -> p.getPrice() * (1 - percentageDecrease / 100));
    }

    private void updateProducts(Predicate<Product> predicate, Function<Product, Double> priceUpdateFunction) {
        products.stream().filter(predicate).forEach(product -> {
            double newPrice = priceUpdateFunction.apply(product);
            product.updatePrice(newPrice);
        });
    }

    public List<Product> findProductsByPriceRange(Predicate<Product> pred) {
        return products.stream()
                .filter(pred)
                .collect(Collectors.toList());
    }
}

public class InventoryApp {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addProduct(new Product("Laptop", 1000.0, 5));
        inventory.addProduct(new Product("Smartphone", 500.0, 10));
        inventory.addProduct(new Product("Tablet", 300.0, 8));

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Display Products");
            System.out.println("2. Update Prices");
            System.out.println("3. Find Products by Price Range");
            System.out.println("4. Calculate Average Price");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    inventory.displayProducts();
                    break;
                case 2:
                    updatePrices(inventory, scanner);
                    break;
                case 3:
                    findProductsByPriceRange(inventory, scanner);
                    break;
                case 4:
                    inventory.calculateAveragePrice();
                    break;
                case 5:
                    System.out.println("Exiting the inventory management system. Goodbye!");
                    scanner.close();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);
    }

    private static void updatePrices(Inventory inventory, Scanner scanner) {
        System.out.println("\nDo you want to increase or reduce the price? (increase/reduce)");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("increase")) {
            System.out.print("Enter the percentage increase: ");
            double percentageIncrease = scanner.nextDouble();
            inventory.updatePrices(percentageIncrease);
            System.out.println("\nPrices updated.");
        } else if (answer.equalsIgnoreCase("reduce")) {
            System.out.print("Enter the percentage decrease: ");
            double percentageDecrease = scanner.nextDouble();
            inventory.updatePrices2(percentageDecrease);
            System.out.println("\nPrices updated.");
        } else {
            System.out.println("\nWrong answer. Try again.");
        }
    }

    private static void findProductsByPriceRange(Inventory inventory, Scanner scanner) {
        System.out.print("Enter the minimum price: ");
        double minPrice = scanner.nextDouble();
        System.out.print("Enter the maximum price: ");
        double maxPrice = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Predicate<Product> predicate = product -> product.getPrice() >= minPrice && product.getPrice() <= maxPrice;
        Function<Product, String> format = product -> "Name: " + product.getName() + ", Price: " + product.getPrice();
        List<Product> productsInRange = inventory.findProductsByPriceRange(predicate);

        System.out.println("Products in the specified price range:");
        productsInRange.stream()
                .map(format)
                .forEach(System.out::println);
    
}
          }