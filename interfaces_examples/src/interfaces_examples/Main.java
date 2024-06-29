package interfaces_examples;


    interface Shape {
        void draw();
    }

    class Circle implements Shape {
    	
        @Override
        public void draw() {
            System.out.println("Drawing a circle.");
        }
    }

    class Rectangle implements Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a rectangle.");
            
        }
    }
    
    
    public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();

        Shape rectangle = new Rectangle();
        rectangle.draw();
    }
}
