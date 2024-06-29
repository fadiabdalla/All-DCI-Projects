package method_overloading;

public class Main {

	public static void main(String[] args) {

		Person person = new Person();
		person.greet();
		
		person.greet("John");
		person.greet(191);
		person.greet("Bob", 199);
		
		
		
	}
	

}
