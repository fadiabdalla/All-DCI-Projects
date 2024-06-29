package package2;

import package1.A;

public class B extends A {

	public static void main(String[] args) {

		B obj = new B();
		
		System.out.println(obj.number); // Error
		obj.msg(); // Error
		
		
	}

}
