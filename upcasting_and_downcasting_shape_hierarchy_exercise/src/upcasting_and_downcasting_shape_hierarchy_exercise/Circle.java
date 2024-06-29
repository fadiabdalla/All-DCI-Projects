package upcasting_and_downcasting_shape_hierarchy_exercise;

public class Circle extends Shape{
	
	 int radius;
	
	

	public Circle(int radius) {
		super();
		this.radius = radius;
	}



	@Override
	double calculateArea() {

		return Math.PI * radius * radius;
	}

}
