package interfaces_inventory_management_exercise;

public class Equipment implements InventoryItem{

	private String equipmentName;
	private double purchasePrice;
	private int availableQuantity;
	
	@Override
	public void addToInventory(int quantity) {

		availableQuantity += quantity;
		
	}

	@Override
	public void removeFromInventory(int quantity) {
		
		if (quantity > 0 && quantity <= availableQuantity) {
            availableQuantity -= quantity;
            } else {
            	System.out.println("The quantity you entered is greater than Available quantity!");
            }
		
	}

	@Override
	public int getAvailableQuantity() {
		
		return availableQuantity;
	}

}
