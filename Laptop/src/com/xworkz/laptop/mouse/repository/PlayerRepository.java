package com.xworkz.laptop.mouse.repository;

import com.xworkz.laptop.mouse.dto.PlayerDTO;

public interface PlayerRepository {
	int NO_OF_PLAYERS = 2;

	void save(PlayerDTO playerDTO);

	PlayerDTO findByName(String name);

	PlayerDTO findByNameAndSportName(String name, String sportName);

}
