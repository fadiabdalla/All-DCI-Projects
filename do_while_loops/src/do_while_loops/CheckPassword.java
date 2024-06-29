package do_while_loops;

import java.io.InputStream;
import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
	String userPassword = "secured";
	
	
	String password = null;
	
	
	do {
		System.out.println("Enter your Password : ");
		password =scanner.nextLine();
		
	}

	while(!password.equals(userPassword));

	
	scanner.close();

	System.out.println("Access granted");
	
		
	}

	

}
