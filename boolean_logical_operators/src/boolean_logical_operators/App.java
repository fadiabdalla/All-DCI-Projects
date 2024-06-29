package boolean_logical_operators;

public class App {

	public static void main(String[] args) {

		
		// Boolean logical operators AND(&&) and OR (||)
		//AND(&&) and OR (||) are also called short-circuit operators
		
		
		boolean isRaining = true;
		boolean haveUmbrella = false;
		boolean takeUmbrella = false;
		
		
		
		/* if(isRaining) {
			
			 if(haveUmbrella) {
				 
				 takeUmbrella = true;
			 }
			 
			 else {
				 
				 takeUmbrella = false;
				 
			 }
		
		}
		
		else {
			
			takeUmbrella = false;
			
		}	
	 
		
		boolean takeUmbrella = false;
		
		if(isRaining) {
			if(haveUmbrella) {
				takeUmbrella= true
			}
		}
		
		*/
		
		if (isRaining && haveUmbrella) {
			
			takeUmbrella = true;
			
			
		}
		
		System.out.println(takeUmbrella);
		
	}

}
