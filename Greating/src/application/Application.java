package application;

public class Application {

	public static void main(String[] args) {
		
		
		GreetingMessage person1 = new GreetingMessage();
		GreetingMessage person2 = new GreetingMessage();
		
		
		person1.name = "Sarah";
		person2.name = "George";
		
		
		person1.greet();
		person2.greet();
	}

}
