package com.example.librarymanagementsystem.controller;

import com.example.librarymanagementsystem.entity.Book;
import com.example.librarymanagementsystem.service.BookServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private BookServiceInterface bs;


    @Autowired
    public BookController(BookServiceInterface bs) {
        this.bs = bs;
    }

    @GetMapping("/getAll")
    public List<Book> getAll (){
       return bs.getAllBooks();
    }

    @PostMapping("/addBook")
    public String addBook(Book book){
        bs.addBook(book);
        return "Book added successfully";
    }
    @GetMapping("/getById/{bookId}")
    public Book getById (@PathVariable Integer bookId){
      Book book = bs.getById(bookId);
        if (book == null){
            throw new RuntimeException("The book id (" + bookId + ") doesn't exist!");
        }
        return book;
    }

    @PutMapping("/update")
    public Book update (Book book){
        Book updatedBook = bs.update(book);

        return updatedBook;
    }

    @DeleteMapping("/delete/{bookId}")
    public String delete (@PathVariable Integer bookId){
        Book book = bs.getById(bookId);
        if (book == null){
            throw new RuntimeException("The book id (" + bookId + ") doesn't exist!");
        }
        bs.delete(bookId);
        return "Book was deleted!";
    }
}
