package static_block;



public class Main {

	final static int NUMBER;
	
	static {
		System.out.println("Hello from static block!");
	NUMBER = 10;	
	}
	
	
	
	public static void main(String[] args) {

		System.out.println("Hello from main!");
		
	}

}
