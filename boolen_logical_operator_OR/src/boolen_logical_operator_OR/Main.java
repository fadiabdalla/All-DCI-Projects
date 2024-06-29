package boolen_logical_operator_OR;

public class Main {

	public static void main(String[] args) {

		
		boolean isRaining = false;
		boolean mightRain = false;
		boolean haveUmbrella = true;
		boolean takeUmbrella = false;
		
		
		if(isRaining || mightRain) {
			
			takeUmbrella = true;
			
			System.out.println(takeUmbrella);
		}
		
		takeUmbrella = isRaining || mightRain;
		
		System.out.println(takeUmbrella);
		
		
		
		//Ternary operator
		
		takeUmbrella = mightRain || isRaining && haveUmbrella? true:false;
		
		System.out.println(takeUmbrella);
	}

}
