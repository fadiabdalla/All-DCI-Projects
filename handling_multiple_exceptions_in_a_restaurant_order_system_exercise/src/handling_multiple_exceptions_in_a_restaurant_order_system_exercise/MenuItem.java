package handling_multiple_exceptions_in_a_restaurant_order_system_exercise;

public class MenuItem {

	private String name;
	private double price;
	

	public MenuItem(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return name + "     " + price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
