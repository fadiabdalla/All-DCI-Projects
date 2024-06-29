package final_keyword;


final class Motorcycle {
	
	final int SPEEDLIMIT_NEW_WORD = 90;
	
	void run() {
		
	//	speedlimit = 200;
	}
	
	final void drive() {
		
		System.out.println("driving....");
		
	}
}


public class Main extends Motorcycle {

	void drive() {}
	
	
	
	
	public static void main(String[] args) {

		/*We can use the final keyword in :
		 * 1. variables   ->  it prevents the value from changing.
		 * 2. methods     ->  it prevents changing the overriden methods.
		 * 3.classes     -> it does not allow inheritance.
		 */
		
		
		Motorcycle m = new Motorcycle();
		m.drive();
		
		
		
		
	}

}
