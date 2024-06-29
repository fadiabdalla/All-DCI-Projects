package com.ormrelations.ormrelationsexercise.repository;

import com.ormrelations.ormrelationsexercise.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepo extends JpaRepository<Movie,Long> {
}
