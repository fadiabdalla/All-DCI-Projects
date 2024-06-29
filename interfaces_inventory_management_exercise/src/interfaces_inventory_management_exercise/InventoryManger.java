package interfaces_inventory_management_exercise;

import java.util.*;

public class InventoryManger {

	 private List<InventoryItem> inventoryItems;

	   
	    public InventoryManger(List<InventoryItem> inventoryItems) {
		super();
		this.inventoryItems = inventoryItems;
	}

		public void addItemToInventory(InventoryItem item) {
	        inventoryItems.add(item);
	    }

	    public void removeItemFromInventory(InventoryItem item) {
	        inventoryItems.remove(item);
	    }

	    public void displayInventory() {
	        System.out.println("Current Inventory:");
	        for (InventoryItem item : inventoryItems) {
	            System.out.println(item.getAvailableQuantity() + " - " +
	                    (item instanceof Product ? "Product: " + ((Product) item).getProductName() :
	                            "Equipment: " + ((Equipment) item).getEquipmentName()));
	        }
	    }