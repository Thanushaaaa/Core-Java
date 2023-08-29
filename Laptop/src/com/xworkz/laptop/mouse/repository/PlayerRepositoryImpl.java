package com.xworkz.laptop.mouse.repository;

import com.xworkz.laptop.mouse.dto.PlayerDTO;

public class PlayerRepositoryImpl implements PlayerRepository {
	private PlayerDTO[] playerDTO = new PlayerDTO[NO_OF_PLAYERS];
	private int index = 0;

	@Override
	public void save(PlayerDTO playerDTO) {
		if (playerDTO != null) {
			System.out.println("invoking save in PlayerRepositoryImpl");
			this.playerDTO[index] = playerDTO;
			System.out.println("The element is stored at " + index);
			this.index++;
		} else {
			System.err.println("can't store, arry is full");
		}

	}

	@Override
	public PlayerDTO findByName(String name) {
		for (int count = 0; count < index; count++) {
			if (playerDTO[count].getName().equals(name)) {
				System.out.println("Player found");
				return playerDTO[count];

			}
			System.out.println("Moving to next index");
		}
		System.err.println("Player not found");
		return null;
	}

	@Override
	public PlayerDTO findByNameAndSportName(String name, String sportName) {
		for (int count = 0; count < index; count++) {
			if (playerDTO[count].getName().equals(name) && playerDTO[count].getSportName().equals(sportName)) {
				System.out.println("Player found");
				return playerDTO[count];

			}
			System.out.println("Moving to next index");
		}
		System.err.println("Player not found");
		return null;
	}

}
