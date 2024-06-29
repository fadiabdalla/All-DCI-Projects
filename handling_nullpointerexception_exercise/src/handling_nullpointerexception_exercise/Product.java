package handling_nullpointerexception_exercise;

public class Product {

	public int productId;
	private String productName;
	private double productPrice;

	 public Product(int productId, String productName, double productPrice) {
	        this.productId = productId;
	        this.productName = productName;
	        this.productPrice = productPrice;
	    }

	    @Override
	    public String toString() {
	        return "ID: " + productId + "\nName: " + productName + "\nPrice: $" + productPrice;
	    }
	}