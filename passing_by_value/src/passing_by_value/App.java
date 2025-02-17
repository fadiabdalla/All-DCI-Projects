package passing_by_value;

public class App {

	public static void main(String[] args) {
		
		//Passing by Value
		
		App app = new App();
		int value = 8;
		System.out.println("1. Value is : " + value) ;
		app.display(value);
		System.out.println("4. Value is : " + value) ;
		
		
		
		
		// Passing by reference
		
		Person person = new Person("John");
		
		System.out.println("1. Person is: " + person);
		
		app.display(person);
		
		System.out.println("4. Person is: " + person);
		
	}

	public void display (int value) {
		
		System.out.println("2. Value is : " + value);
		
		value = 9;
		
		System.out.println("3. Value is : " + value);
		
	}
	
	
	public void display (Person person) {
		
		System.out.println("2. Person is: " + person);
		person.setName("Sue");
		person = new Person("Mike");
		System.out.println("3. Person is: " + person);
		
	}
}
