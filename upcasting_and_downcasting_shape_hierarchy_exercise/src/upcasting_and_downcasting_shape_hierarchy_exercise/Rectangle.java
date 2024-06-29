package upcasting_and_downcasting_shape_hierarchy_exercise;

public class Rectangle extends Shape {
	
	 double width;
	 double height;
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	double calculateArea() {
		
		
		return width*height;
	}

}
