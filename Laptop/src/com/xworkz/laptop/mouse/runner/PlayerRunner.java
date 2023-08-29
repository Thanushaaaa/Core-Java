package com.xworkz.laptop.mouse.runner;

import com.xworkz.laptop.mouse.service.*;
import com.xworkz.laptop.mouse.dto.PlayerDTO;
import com.xworkz.laptop.mouse.repository.*;

public class PlayerRunner {

	public static void main(String[] args) {
		PlayerDTO playerDTO = new PlayerDTO("Ishan", "Cricket");
		PlayerRepository playerRepository = new PlayerRepositoryImpl();
		PlayerService playerService = new PlayerServiceImpl(playerRepository);
		boolean stored = playerService.validAndSave(playerDTO);
		if (stored) {
			System.out.println("Data is stored");
		} else {
			System.err.println("Data isn't stored");
		}
		PlayerDTO found = playerService.findByName("Ishan");
		System.out.println(found);

		PlayerDTO found1 = playerService.findByNameAndSportName("Ishan", "Cricket");
		System.out.println(found1);

	}

}
