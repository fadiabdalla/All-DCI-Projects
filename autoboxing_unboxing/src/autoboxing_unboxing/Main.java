package autoboxing_unboxing;

public class Main {

	public static void main(String[] args) {

		int x = 40;
		
		//Integer y = new Integer(x); //AutoBoxing or Boxing
		Integer y = x;
		Integer z = 6;  // Boxing
		
		System.out.println(y + " " + z);
		System.out.println();
		
		Integer a = 60;
		int n = a; // unboxing
		
		System.out.println(n);
		
		System.out.println();
		
		
		Integer num = 79;
		if(num < 90) {
			System.out.println(num);
		}
		
		
	}

}
