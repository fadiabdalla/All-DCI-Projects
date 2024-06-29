package double_colon_operator_super_methods;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

class Test {
	
	String print(String s) {
		
		return ("Hello" + s + "\n");
	}
	
}

public class Main extends Test{
	
	

	@Override
	String print(String s) {
		
		Function<String,String> func = super::print;
		String newValue = func.apply(s);
		newValue += "Bye " + s + "\n"; 
		System.out.println(newValue);
		return newValue;
	}

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Fadi!");
		list.add("Sandy!");
		list.add("Alex!");
		
		list.forEach((new Main())::print);
		
		
	}

}
