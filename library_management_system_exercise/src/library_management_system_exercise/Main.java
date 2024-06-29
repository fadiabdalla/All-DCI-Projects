package library_management_system_exercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        

        int choice;
        do {
            System.out.println("Library Management System Menu:");
            System.out.println("1. Add a Book");
            System.out.println("2. Check out a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. View Available Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    long ISBN = scanner.nextLong();
                    Book newBook = new Book(title, author, ISBN);
                    library.addBook(newBook);
                    System.out.println("Book added successfully.");
                    break;
                case 2:
                    System.out.print("Enter Book ISBN to check out: ");
                    long checkoutISBN = scanner.nextLong();
                    System.out.print("Enter Member Name: ");
                    String memberName = scanner.nextLine();
                    System.out.print("Enter Member Contact: ");
                    String memberContact = scanner.nextLine();
                    System.out.print("Enter Member ID: ");
                    int memberID = scanner.nextInt();
                    LibraryMember member = new LibraryMember(memberName, memberContact, memberID);

                    Book checkoutBook = null;
                    for (Book book : library.getBooks()) {
                        if (book.getISBN() == checkoutISBN && book.isAvailable()) {
                            checkoutBook = book;
                            break;
                        }
                    }

                    if (checkoutBook != null) {
                        library.checkOutBook(checkoutBook, member);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Book ISBN to return: ");
                    long returnISBN = scanner.nextLong();
                    Book returnBook = null;
                    for (Book book : library.getBooks()) {
                        if (book.getISBN() == returnISBN && !book.isAvailable()) {
                            returnBook = book;
                            break;
                        }
                    }
                    if (returnBook != null) {
                        library.returnBook(returnBook);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4:
                    library.displayAvailableBooks();
                    break;
                case 5:
                	library.saveData();
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);
        scanner.close();
    }
}
