package com.brunopires.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunopires.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
			
}
