package com.example.librarymanagementsystem.service;

import com.example.librarymanagementsystem.dao.BookDAOInterface;
import com.example.librarymanagementsystem.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements BookServiceInterface {

    BookDAOInterface bd;


    @Autowired
    public BookService(BookDAOInterface bookDAOInterface) {
        this.bd = bookDAOInterface;
    }

    @Override
    public void addBook(Book book) {

        bd.addBook(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bd.getAllBooks();
    }

    @Override
    public Book getById(Integer id) {
        return bd.getById(id);
    }

    @Override
    public Book update(Book book) {
        return bd.update(book);
    }

    @Override
    public void delete(Integer id) {
        bd.delete(id);
    }
}
