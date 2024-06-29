package email_list_hashset_exercise;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
    	Set<String> emailList = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        
        String input;

        do {
            System.out.println("Enter email addresses. To stop please type 'exit': ");
             input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            } else {
                if (emailList.add(input)) {
                    System.out.println("Email added successfully.");
                } else {
                    System.out.println("Email already exists in the list.");
                }
            }
        } while (!input.equalsIgnoreCase("exit"));

        System.out.println("Unique Email Addresses in the List:");
        for (String email : emailList) {
            System.out.println(email);
        }
    }
}
