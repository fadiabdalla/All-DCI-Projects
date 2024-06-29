package handling_nullpointerexception_exercise;

import java.util.*;


public class Inventory {

	private Map<Integer, Product> items = new HashMap<>();
	 

	public void addProduct(Product product) {

		items.put(product.productId,product);
		
	}
	
	public String getProductDetails(int productId) {

		 try {
	            Product item = items.get(productId);
	            if (item != null) {
	                
	            	return items.toString();
	            } else {
	            	throw new NullPointerException("Not found");
	            }
	            
	        } catch (NullPointerException e) {
	            
	        	return e.getMessage();
	        }
			
		
	}

}
