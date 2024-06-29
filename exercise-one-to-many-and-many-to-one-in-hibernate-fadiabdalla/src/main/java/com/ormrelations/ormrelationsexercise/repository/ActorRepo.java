package com.ormrelations.ormrelationsexercise.repository;

import com.ormrelations.ormrelationsexercise.entity.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActorRepo extends JpaRepository<Actor,Long> {
}
