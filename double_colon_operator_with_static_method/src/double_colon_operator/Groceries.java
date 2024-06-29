package double_colon_operator;



import java.util.ArrayList;
import java.util.List;

public class Groceries {

	/*
	 * The double colon operator (::) is a special lambda expression.
	 * This operator is also known as method reference operator.
	 * 
	 * Where can we use the double colon operator?
	 * we can use it to refer to :
	 * - Static method.
	 * -Instance methods.
	 * -Constructors.
	 * 
	 * 
	 * Syntax:
	 * (ClassName::MethodName)
	 */
	
	static void items(String s) {
		
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Apples");
		list.add("Milk");
		list.add("Rice");
		
		list.forEach(Groceries::items);

		
	}

}
