package com.hudsonandrade.dslist.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hudsonandrade.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
