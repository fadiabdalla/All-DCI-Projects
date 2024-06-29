package shapeAreaCalculator;

import java.util.Scanner;

public class ShapeAreaCalculator {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculate = new Calculator();

        System.out.println("Choose a shape to calculate area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Enter your choice (1,2 or 3): ");
        int choice = scanner.nextInt();

        double area = 0.0;

        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                area = calculate.calculateArea(radius);
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                 double width = scanner.nextDouble();
                area = calculate.calculateArea(length, width);
                break;
            case 3:
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                area = calculate.calculateArea(base, height);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
        
        scanner.close();

        System.out.println("Area: " + area);

      
    }

    }
