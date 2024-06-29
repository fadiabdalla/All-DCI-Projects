package streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
	/* 
	 * Streams are a continuous of data.
	 */
	

	public static void main(String[] args) {


		ArrayList<Integer> numbers = new ArrayList<>(List.of(1,2,5,7,9,10));;
		
		numbers.stream().forEach(n -> System.out.println(n));
		
	}

}
