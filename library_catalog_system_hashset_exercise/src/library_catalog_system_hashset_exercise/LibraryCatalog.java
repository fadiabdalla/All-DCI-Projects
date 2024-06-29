package library_catalog_system_hashset_exercise;

import java.util.HashSet;
import java.util.Set;

public class LibraryCatalog {

	Set<Book> book = new HashSet<>();

	public void addBook(String title, String author) {

		book.add(new Book(title, author));

	}

	public void searchByTitle(String title) {
		if (book.contains(title)) {

			System.out.println("The book with the title" + title + " is exist in the library");

		} else {

			System.out.println("The book with the title" + title + " is not found.");
		}

	}
	
	public void searchByAuthor(String Author) {
		
		
		
		
		
		
	}
	
	

}
