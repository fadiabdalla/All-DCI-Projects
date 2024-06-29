package interfaces_inventory_management_exercise;

public class Product implements InventoryItem{
	
	private String productName;
	private double unitPrice;
	private int availableQuantity;

	public Product(String productName, double unitPrice) {
		super();
		this.productName = productName;
		this.unitPrice = unitPrice;
	}

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
