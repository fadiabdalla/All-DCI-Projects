package com.example.librarymanagementsystem.service;

import com.example.librarymanagementsystem.entity.Book;

import java.util.List;

public interface BookServiceInterface {

    void addBook (Book book);
    List<Book> getAllBooks();

    Book getById(Integer id);

    Book update (Book book);

    void delete(Integer id);


}
