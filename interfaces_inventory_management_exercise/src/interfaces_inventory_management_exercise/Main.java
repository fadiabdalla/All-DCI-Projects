package interfaces_inventory_management_exercise;

public class Main {

	public static void main(String[] args) {

	
		        InventoryManager manager = new InventoryManager();

		        Product product = new Product("Laptop", 999.99);
		        Equipment equipment = new Equipment();

		        manager.addItemToInventory(product);
		        manager.addItemToInventory(equipment);

		        product.addToInventory(10);
		        equipment.addToInventory(5);

		        manager.displayInventory();
		    }
		
	
}