package shape_hierarchy_exercise;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setColor("Black");
        circle.setRadius(3.5);

        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Blue");
        rectangle.setWidth(7.5);
        rectangle.setHeight(9);

        System.out.println("Circle Color: " + circle.getColor());
        System.out.println("Circle Radius: " + circle.getRadius());
        System.out.println("Circle Area: " + circle.calculateArea());

        System.out.println("Rectangle Color: " + rectangle.getColor());
        System.out.println("Rectangle Width: " + rectangle.getWidth());
        System.out.println("Rectangle Height: " + rectangle.getHeight());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}

