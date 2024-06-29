package online_shopping_game_exercise;

public class VirtualItem {
	public VirtualItem(int itemID, int points, String name, double price) {
		super();
		this.itemID = itemID;
		this.points = points;
		this.name = name;
		this.price = price;
	}
	private int itemID, points;
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private String name;
	private double price;
	@Override
	public String toString() {
		return "Item :\nitemID: " + itemID + ", points :" + points + ", name: " + name + ", price:" + price ;
	}

}
