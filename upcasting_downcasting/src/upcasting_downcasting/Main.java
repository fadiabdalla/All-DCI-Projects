package upcasting_downcasting;

class Parent{
	
	String name;
	
	void greet() {
		System.out.println("Greetings from Parent class.");
		
	}
	
}


class Child  extends Parent{
	
	int age;

	@Override
	void greet() {
		System.out.println("Greetings from Child class.");
	}
	
	
	
}
public class Main{

	public static void main(String[] args) {

		Parent parent = new Child(); //  Upcasting
		parent.name = "Bob";
		System.out.println(parent.name);
		parent.greet();
	
		// parent.age = 32; --> error
		
		// Child child = new Parent();   -->  compile time error
		
	
		Child child = (Child) parent; // Downcasting
		
		child.age = 32;

		System.out.println(child.name);
		System.out.println(child.age);
		child.greet();
		
		
	}

}
