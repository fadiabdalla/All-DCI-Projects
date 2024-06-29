package swapNumbers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the first number");
	    int x = scanner.nextInt();
		
	    System.out.println("Enter the second number");
	    int y = scanner.nextInt();
	    
	    swap(x,y);
	    

	    
		
	}
public static void swap (int x, int y) {
	int z = x;
	x = y;
	y = z;
	
	System.out.println("the first number is : " + x);
	System.out.println("the second number is : " + y);
}
	
}
