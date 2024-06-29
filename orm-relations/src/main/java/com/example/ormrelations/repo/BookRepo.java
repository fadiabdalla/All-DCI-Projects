package com.example.ormrelations.repo;

import com.example.ormrelations.entity.Author;
import com.example.ormrelations.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;



public interface BookRepo extends JpaRepository <Book,Long> {

}
