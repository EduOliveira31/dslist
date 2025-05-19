package com.eduardooliveira.dslist.repositories;

import com.eduardooliveira.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
