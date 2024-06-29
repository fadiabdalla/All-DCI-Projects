package incrementing;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter an integer Number ");
		int num = scanner.nextInt();
	
		inc (num);
	
		
	}
	
	
	
	public static void inc(int num) {
		System.out.println("The original value is :" + num);
		num ++;
		System.out.println("The incremented value is : " + num);
	} 

}
