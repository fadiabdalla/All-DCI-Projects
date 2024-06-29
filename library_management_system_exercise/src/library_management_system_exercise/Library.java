package library_management_system_exercise;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
        loadData();
    }

    public void addBook(Book book) {
        books.add(book);
        saveData();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void checkOutBook(Book book, LibraryMember member) {
        if (book.isAvailable()) {
            book.setBorrowedBy(member);
            book.setAvailabilityStatus(false);
            System.out.println("Book checked out successfully by " + member.getName());
        } else {
            System.out.println("Sorry, the book is not available.");
        }
        saveData();
    }

    public void returnBook(Book book) {
        book.setAvailabilityStatus(true);
        System.out.println("Book returned successfully.");
        saveData();
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }

     void loadData() {
        try (BufferedReader reader = new BufferedReader(new FileReader("//home//dci-student//Desktop//database.csv"))) {
            // Load data from the file and populate the books ArrayList
            // ...
            System.out.println("Data loaded successfully!");
        } catch (IOException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }

     void saveData() {
        try (FileOutputStream file = new FileOutputStream("//home//dci-student//Desktop//database.csv")) {
            // Save data from the books ArrayList to the file
            // ...
            System.out.println("Books saved successfully!");
        } catch (IOException e) {
            System.out.println("Error saving books: " + e.getMessage());
        }
    }
}
