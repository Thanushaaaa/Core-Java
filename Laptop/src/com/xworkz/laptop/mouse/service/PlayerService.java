package com.xworkz.laptop.mouse.service;

import com.xworkz.laptop.mouse.dto.PlayerDTO;

public interface PlayerService {
	boolean validAndSave(PlayerDTO playerDTO);

	PlayerDTO findByName(String name);

	PlayerDTO findByNameAndSportName(String name, String sportName);

}
