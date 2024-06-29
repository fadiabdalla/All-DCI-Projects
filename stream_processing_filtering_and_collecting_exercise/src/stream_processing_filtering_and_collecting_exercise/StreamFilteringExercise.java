package stream_processing_filtering_and_collecting_exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilteringExercise {

	static List<String> filterAndCollect(List<Book> books) {

		return books.stream().filter(book -> book.getPublishDate() >= 2000).map(Book::getTitle)
				.collect(Collectors.toList());

	}

	public static void main(String[] args) {

		List<Book> books = new ArrayList<>();

		books.add(new Book("Hamlet", 1850));
		books.add(new Book("The Great Gatsby", 1925));
		books.add(new Book("To Kill a Mockingbird", 1960));
		books.add(new Book("The Hunger Games", 2008));
		books.add(new Book("Angels and Demones", 2006));

		List<String> filteredList = filterAndCollect(books);

		System.out.println("The original List of Books: ");
		books.forEach(System.out::println);
		System.out.println("---------------------");

		System.out.println("The Books are published after 2000  : ");
		System.out.println(filteredList);

	}

}
