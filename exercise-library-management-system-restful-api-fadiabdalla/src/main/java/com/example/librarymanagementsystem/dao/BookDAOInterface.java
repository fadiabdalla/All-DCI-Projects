package com.example.librarymanagementsystem.dao;

import com.example.librarymanagementsystem.entity.Book;

import java.util.List;

public interface BookDAOInterface {

    void addBook (Book book);
    List<Book> getAllBooks();

    Book getById(Integer id);

    Book update (Book book);

    void delete(Integer id);

}
