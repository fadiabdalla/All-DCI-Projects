package abstract_classes_examples2;

abstract class Shape {
	
	abstract void shape();
	
}

class Rectangle extends Shape{

	@Override
	void shape() {


		System.out.println("Rectangle shape.");
	
	
	}
}
	class Circle extends Shape{

		@Override
		void shape() {

			System.out.println("Circle shape.");
		}
		
	
	
	}
	


public class Main {

	public static void main(String[] args) {

		Shape s1 = new Rectangle();
		Shape s2 = new Circle();
		s1.shape();
		s2.shape();
		
		
	}

}
