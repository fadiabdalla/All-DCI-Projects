package method_parameters;

public class App {

	public static void main(String[] args) {

		Calculator calculate = new Calculator();
		
	int squared = calculate.square(8);
	System.out.println(squared);
	
	int added = calculate.add(5 ,12);
	System.out.println("5 plus 12 is = " + added);
	
	}

}
