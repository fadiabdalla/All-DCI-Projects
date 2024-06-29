package function_unaryoperator_interfces;

import java.util.function.UnaryOperator;

public class Main {
	
	/*public interface Function<T,R>
	 * public interface Unaryoperator extends Function<T,R>
	 * Unaryoperator inherits the apply() from Function<T,R>
	 */

	public static void main(String[] args) {
		
		new Main().run();
		
		
	}
	
	public void run() {
		//System.out.println(!true);
		calculate(8, n -> n*n); // this will return n squared
		calculate(8, n -> n+1);
		calculate(8, n -> n*2);
		calculate(8, n -> 0);
	}
	
	public void calculate(int value, UnaryOperator<Integer> process) {
		
		int results = process.apply(value);
		System.out.println(results);
		
	}

}
