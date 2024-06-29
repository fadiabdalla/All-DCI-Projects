package polymorphism_with_static_methods_geometric_shapes_exercise;

public class ShapeCalculator {
	public static void main(String[] args) {

		Double[] shapes = new Double[3];
		shapes[0] = Circle.calculateArea(5);
		shapes[1] = Rectangle.calculateArea(7, 8);
		shapes[2] = Triangle.calculateArea(5, 9);

		for (Double shape : shapes) {

			System.out.println("The shape Area = " + shape);

		}

	}

}
