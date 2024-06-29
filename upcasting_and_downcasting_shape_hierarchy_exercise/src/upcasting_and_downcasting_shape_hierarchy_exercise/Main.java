package upcasting_and_downcasting_shape_hierarchy_exercise;

public class Main {

	public static void main(String[] args) {
		
		// Upcasting

		Shape circle = new Circle(5);
		Shape rectangle = new Rectangle(5,9);
		Shape triangle = new Triangle(3,7);
		
		circle.name = "Circle";
		circle.color = "Red";
		
		rectangle.name = "Rectangle";
		rectangle.color = "Blue";
		
		triangle.name = "Triangle";
		triangle.color = "Black";
		
		System.out.println("Name : " + circle.name);
		System.out.println("Color : " + circle.color);
		System.out.println("Area : " + circle.calculateArea());
		System.out.println("----------------------------------------------");
		
		System.out.println("Name : " + rectangle.name);
		System.out.println("Color : " + rectangle.color);
		System.out.println("Area: " + rectangle.calculateArea());
		System.out.println("----------------------------------------------");
		
		System.out.println("Name : " + triangle.name);
		System.out.println("Color : " + triangle.color);
		System.out.println(" Area : " + triangle.calculateArea());
		System.out.println("====================================");
		System.out.println();
		
		
		// Downcasting
		
		Circle c = (Circle) circle;
		Rectangle r = (Rectangle) rectangle;
		Triangle t = (Triangle) triangle;
		
		
		
		r.height = 7;
		r.width = 8;
		
		t.base = 5;
		t.height = 6;
		
		System.out.println("Name : " + c.name);
		System.out.println("Color : " + circle.color);
		System.out.println("Area : " + c.calculateArea());
		System.out.println("----------------------------------------------");
		
		System.out.println("Name : " + r.name);
		System.out.println("Color : " + r.color);
		System.out.println("Area: " + r.calculateArea());
		System.out.println("----------------------------------------------");
		
		System.out.println("Name : " + t.name);
		System.out.println("Color : " + t.color);
		System.out.println("Triangle Area : " + t.calculateArea());
		
	}

}
