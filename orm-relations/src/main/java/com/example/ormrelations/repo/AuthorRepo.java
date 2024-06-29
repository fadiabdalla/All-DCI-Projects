package com.example.ormrelations.repo;

import com.example.ormrelations.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<Author,Long> {


}
