package arraylist_shopping_list_exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
	
	public void addItem(ArrayList<String> shoppingList) {
        System.out.print("Enter the item to add: ");
        scanner.nextLine(); 
        String item = scanner.nextLine();
        shoppingList.add(item);
        System.out.println(item + " added to the list.");
    }

    public void removeItem(ArrayList<String> shoppingList ) {
        if (shoppingList.isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }

        System.out.print("Enter the item to remove: ");
        scanner.nextLine();
        String itemToRemove = scanner.nextLine();

        if (shoppingList.contains(itemToRemove)) {
            shoppingList.remove(itemToRemove);
            System.out.println(itemToRemove + " removed from the list.");
        } else {
            System.out.println("Item not found in the list.");
        }
    }

    public void displayList(ArrayList<String> shoppingList) {
        if (shoppingList.isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }

        System.out.println("Shopping List:");
        for (String item : shoppingList) {
            System.out.println("* " + item);
        }
    }
	

}
