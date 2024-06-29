package grocery_list_linkedlist_exercise;

public class Main {
    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();

        groceryList.addItem("Banana", 1.49);
        groceryList.addItem("Water", 0.99);
        groceryList.addItem("Tomato", 2.99);
        
        groceryList.displayList();
    }
}