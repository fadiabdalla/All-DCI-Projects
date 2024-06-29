package grocery_list_linkedlist_exercise;

import java.util.LinkedList;

class GroceryList {
    LinkedList<GroceryItem> items = new LinkedList<>();

    void addItem(String name, double price) {
        GroceryItem newItem = new GroceryItem(name, price);
        items.add(newItem);
    }

    void displayList() {
        System.out.println("Grocery List:");
        for (int i = 0; i < items.size(); i++) {
            GroceryItem item = items.get(i);
            System.out.println("Item " + (i + 1) + ": " + item.name + " ($" + item.price + ")");
        }
    }
}

