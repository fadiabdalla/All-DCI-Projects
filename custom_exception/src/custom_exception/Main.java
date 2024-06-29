package custom_exception;

class InvaildAgeException extends Exception{
	public InvaildAgeException(String errorMessage) {
		
		super(errorMessage);	
	}
}


public class Main {
	
	static void validate(int age) throws InvaildAgeException {
		
		if(age < 21) {
			
			throw new InvaildAgeException("Age is not valid!");
			
		}else {
			
			System.out.println("Age is valid!");
		}
	}

	public static void main(String[] args) {

		try {
			validate(22);
		}catch(InvaildAgeException e) {
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("normal flow...");
	}

}
