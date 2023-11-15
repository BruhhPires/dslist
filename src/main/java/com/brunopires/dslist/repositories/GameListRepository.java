package com.brunopires.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunopires.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
			
}
