package upcasting_and_downcasting_shape_hierarchy_exercise;

public class Triangle extends Shape{
	 double base = 5;
	 double height = 7;
	
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	@Override
	 double calculateArea() {
		
		
		return (base*height)/2;
	}
	

}
