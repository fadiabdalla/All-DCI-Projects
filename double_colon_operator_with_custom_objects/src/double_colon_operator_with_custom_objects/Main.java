package double_colon_operator_with_custom_objects;

import java.util.ArrayList;
import java.util.List;

class Person {
	
	String name;
	
	Person(String name){
		
		this.name = name;
	}
	
	void someMethod() {
		System.out.println(this.name);
	}
}
public class Main {
	
	/*
	 * Custom objects:
	 * Syntax (ClassName::methodName)
	 */

	public static void main(String[] args) {

		
		List<Person> list = new ArrayList<>();
		
		list.add(new Person("Fadi"));
		list.add(new Person("Sandy"));
		list.add(new Person("Marwan"));
		
		list.forEach(Person::someMethod);
		
		
	}

}
