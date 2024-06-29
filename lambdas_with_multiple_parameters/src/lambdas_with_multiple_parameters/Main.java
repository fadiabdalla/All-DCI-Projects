package lambdas_with_multiple_parameters;


@FunctionalInterface
interface MyInterface{
	
	void start(String name, String lastName, int age);
}

public class Main {

	public static void main(String[] args) {

		MyInterface lambda = (f,l,a) -> System.out.println("Name: " + f + " " + l + ", Age: " + a);
		
		person(lambda);
	}
	
	public static void person(MyInterface lambda) {
		
		
		lambda.start("Fadi", "Georgous Abdallah", 31);
		
	}

}
