package interfaces_inventory_management_exercise;

public interface InventoryItem {

	void addToInventory(int quantity) ;
	void removeFromInventory(int quantity);
	int getAvailableQuantity();
	
	
}
