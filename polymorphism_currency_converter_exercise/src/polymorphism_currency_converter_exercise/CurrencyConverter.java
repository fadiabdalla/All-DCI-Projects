package polymorphism_currency_converter_exercise;

public class CurrencyConverter {

	public static void main(String[] args) {

		Double[] amounts = new Double[3];
		
		amounts[0] = EUR.convertToUSD(50);
		amounts[1] = GBP.convertToUSD(100);		
		amounts[2] = USD.convertToUSD(200);
		
		
		 for (double amount : amounts)
	            System.out.println("Amount in USD: " + amount);
	        }
	    }
		



