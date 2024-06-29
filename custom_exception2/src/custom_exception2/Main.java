package custom_exception2;

import custom_exception.InvaildAgeException;

class InvaildAgeException extends Exception{
	
}
public class Main {

	public static void main(String[] args) {

		
		try {
			
			throw new InvaildAgeException();
		}catch(InvaildAgeException e) {
			System.out.println("Catch block of InvaildAgeException." );
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("normal flow...");
	}

}
