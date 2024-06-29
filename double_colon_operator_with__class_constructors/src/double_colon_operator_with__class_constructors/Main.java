package double_colon_operator_with__class_constructors;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	/*
	 * Class Constructor :
	 * Syntax (ClassName::new)
	 */

	public Main(String s) {
		
		System.out.println("Hello " + s);
	}
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Fadi!");
		list.add("Sandy!");
		list.add("Nadia!");
		
		list.forEach(Main::new);
		
	}

}
