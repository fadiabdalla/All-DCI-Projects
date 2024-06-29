package arraylist_shopping_list_exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add an item");
            System.out.println("2. Remove an item");
            System.out.println("3. Display the list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the item to add: ");
                    String itemToAdd = scanner.nextLine();
                    shoppingList.add(itemToAdd);
                    System.out.println(itemToAdd + " added to the list.");
                    break;
                case 2:
                    System.out.print("Enter the item to remove: ");
                    String itemToRemove = scanner.nextLine();
                    if (shoppingList.contains(itemToRemove)) {
                        shoppingList.remove(itemToRemove);
                        System.out.println(itemToRemove + " removed from the list.");
                    } else {
                        System.out.println(itemToRemove + " not found in the list.");
                    }
                    break;
                case 3:
                    if (shoppingList.isEmpty()) {
                        System.out.println("The list is empty.");
                    } else {
                        System.out.println("Shopping List:");
                        for (String item : shoppingList) {
                            System.out.println("* " + item);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
            
            System.out.println();
        }
    }
}
