package calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Calculator calculate = new Calculator();
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the first number");
	double a = scanner.nextDouble();
	
	
	System.out.println("Enter the second number");
	double b = scanner.nextDouble();
	
    double sum = calculate.addition(a, b);
    System.out.println(a + "+" + b + "=" + sum);

    double sub = calculate.subtraction(a, b);
    System.out.println(a + "-" + b + "=" + sub);
    
    double multipli = calculate.multiplication(a, b);
    System.out.println(a + "*" + b + "=" + multipli);
    
    double div = calculate.division(a, b);
    System.out.println(a + "/" + b + "=" + div);
	}

}
