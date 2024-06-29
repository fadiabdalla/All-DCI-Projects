package package1;

abstract class A {
	/*
	 * 1. An abstract class must be declared with the abstract keyword:
	 * 2. Abstract classes cannot be instantiated(you cannot create an instance of an abstract class.).
	 * 3. It can have abstract and non-abstract methods.
	 * 4. It can have static methods and constructors as well.
	 * 5. It can have final methods which will force the subclass not to change the body of the method.
	 */
	abstract void greet(); // there is no method body in abstract methods.
	
	public void run() {
		System.out.println("running...");
	}

}
