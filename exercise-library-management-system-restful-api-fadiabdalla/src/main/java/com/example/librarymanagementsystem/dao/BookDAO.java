package com.example.librarymanagementsystem.dao;

import com.example.librarymanagementsystem.entity.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAO implements BookDAOInterface{

    EntityManager em;


    @Autowired
    public BookDAO(EntityManager entityManager) {
        this.em = entityManager;
    }

    @Transactional
    @Override
    public void addBook(Book book) {
       em.persist(book);

    }

    @Override
    public List<Book> getAllBooks() {

        TypedQuery query = em.createQuery("FROM Book",Book.class);
        return query.getResultList();
    }

    @Override
    public Book getById(Integer id) {
        Book book = em.find(Book.class,id);
        return book;
    }

    @Transactional
    @Override
    public Book update(Book book) {
        Book updatedBook = em.merge(book);
        return updatedBook;
    }

    @Transactional
    @Override
    public void delete(Integer id) {

        Book book = em.find(Book.class,id);
        em.remove(book);
    }
}
