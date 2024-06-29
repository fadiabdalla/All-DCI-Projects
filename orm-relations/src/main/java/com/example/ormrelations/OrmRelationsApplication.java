package com.example.ormrelations;

import com.example.ormrelations.entity.Author;
import com.example.ormrelations.entity.Book;
import com.example.ormrelations.repo.AuthorRepo;
import com.example.ormrelations.repo.BookRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OrmRelationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrmRelationsApplication.class, args);
	}

	@Bean
	public CommandLineRunner crudOperation (AuthorRepo authorRepo, BookRepo bookRepo){

	return  args -> {

		// Create authors

		Author author1 =  new Author();
		author1.setName("Kristin Hannah");

		Author author2 =  new Author();
		author2.setName("Rebecca Yarros");

		authorRepo.save(author1);
		authorRepo.save(author2);


		// Create books

		Book book1 = new Book();
		book1.setTitle("The Women");
		book1.setAuthor(author1);

		Book book2 = new Book();
		book2.setTitle("Fourth Wing");
		book2.setAuthor(author1);

		Book book3 = new Book();
		book3.setTitle("Iron Flame");
		book3.setAuthor(author2);


		bookRepo.save(book1);
		bookRepo.save(book2);
		bookRepo.save(book3);


		// Red all authors

		System.out.println("All authors: ");

		authorRepo.findAll().forEach(System.out::println);

		// Read all books

		System.out.println("All Books: ");
		bookRepo.findAll().forEach(System.out::println);



		// Update a book

		Book bookToUpdate = bookRepo.findById(1L).orElse(null);
		if(bookToUpdate != null){

			bookToUpdate.setTitle("Fly me to the Moon");

			bookRepo.save(bookToUpdate);
			System.out.println("Updated book: " + bookToUpdate);
		}else {
			System.out.println("Book not found!");
		}

		// Delete a book

		bookRepo.deleteById(3L);
		System.out.println("Book with ID 3 deleted!");

		// Read all books after deletion
		System.out.println("All books after Deletion: ");
		bookRepo.findAll().forEach(System.out::println);
	};

	}
}
