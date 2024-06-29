package handling_arrayindexoutofboundsexception_exercise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		LibraryCatalog book = new LibraryCatalog();
		
		int choice;
		do {
			System.out.println("Library Catalog:");
			System.out.println("1. Search");
			System.out.println("2. Exit");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter Book Index: ");
				int index = scanner.nextInt();
				scanner.nextLine(); 
				String bookName = book.searchBook(index);
				System.out.println(bookName);
				break;

			case 2:
				System.out.println("Exiting program...");
				break;

			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}
		} while (choice != 2);
		
		scanner.close();
	}

		
	}


