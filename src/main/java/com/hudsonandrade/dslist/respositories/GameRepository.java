package com.hudsonandrade.dslist.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hudsonandrade.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}