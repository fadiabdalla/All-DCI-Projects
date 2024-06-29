package stream_processing_filtering_and_counting_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamFilterCountExercise {
	
	static long filterAndCount(List<Book> books, Predicate<Book> filter) {
		List<Book> filteredList = new ArrayList<>(); 
		
		 return books.stream()
	                .filter(filter)
	                .count();
		
		
	}


	public static void main(String[] args) {
		
	
		List<Book> books = new ArrayList<>();
		
		books.add(new Book("Hamlet", 1850));
		books.add(new Book("The Great Gatsby",1925));
		books.add(new Book("To Kill a Mockingbird",1960));
		books.add(new Book("The Hunger Games",2008));
		books.add(new Book("Angels and Demones",2006));
		
	


		Predicate<Book> filter = book -> book.getPublishDate()>2000;

		
		System.out.println("The original List of Books: ");
		books.forEach(System.out::println);
		System.out.println("---------------------");
		
		System.out.println("The Number of Books are published after 2000 is : " + filterAndCount(books,filter));
		
		

		
		
	}

}
