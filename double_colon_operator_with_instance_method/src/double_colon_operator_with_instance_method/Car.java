package double_colon_operator_with_instance_method;

import java.util.ArrayList;
import java.util.List;

public class Car {

	/* 
	 * Instance methods:
	 * Syntax (objetOfClass::methodName)
	 */
	
	void brands (String s) {
		
		System.out.println(s);
	}
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Volvo");
		list.add("Bmw");
		list.add("Mercedes");
		list.forEach((new Car()::brands));

	}

}
