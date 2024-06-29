package downcasting_with_instanceof_operator;

class Car{
	
	
	
}


public class Mercedes extends Car{

	
	public static void method (Car c) {
		
//	if(c instanceof Mercedes ) {
//		
//		Mercedes m = (Mercedes) c;  // downcasting
//		System.out.println("Downcasting performed!");
//	}else {
//		
//		
//		System.out.println("Downcasting not performed!");
//	}	
		
		if(Mercedes.class.isInstance(c)) {
			
			Mercedes m = (Mercedes) c; // Downcasting
			System.out.println("Downcasting performed!");
			}else {
				
			System.out.println("Downcasting not performed!");
		}
	}
	public static void main(String[] args) {

		Car c = new Mercedes();
		
		Mercedes.method(c);
	
		
	}

}
