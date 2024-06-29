package interfaces_multiple_implements;


interface Print{
	
	void print();
	
}

interface Display{
	
	void display();
	
}


		
public class Main implements Print, Display {
		

	@Override
	public void display() {

		System.out.println("Display only.");
		
	}

	@Override
	public void print() {

		System.out.println("Printing...");
		
	}
	public static void main(String[] args) {

		
		
		Main m = new Main();
		
		m.display();
		m.print();
		
}

	}