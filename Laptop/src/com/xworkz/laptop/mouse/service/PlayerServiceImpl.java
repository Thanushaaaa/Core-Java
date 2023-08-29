package com.xworkz.laptop.mouse.service;

import com.xworkz.laptop.mouse.dto.MovieDTO;
import com.xworkz.laptop.mouse.dto.PlayerDTO;
import com.xworkz.laptop.mouse.repository.PlayerRepository;
import com.xworkz.laptop.mouse.util.ValidationUtil;

public class PlayerServiceImpl implements PlayerService {
	private PlayerRepository playerRepository;

	public PlayerServiceImpl(PlayerRepository playerRepository) {
		this.playerRepository = playerRepository;
	}

	@Override
	public boolean validAndSave(PlayerDTO playerDTO) {
		if (playerDTO != null) {
			System.out.println("Invoking ValidAndSave in PlayerServiceImpl");
			System.out.println("Data entered is " + playerDTO);
			String name = playerDTO.getName();
			String sport = playerDTO.getSportName();
			if (ValidationUtil.validateString(name)) {
				System.out.println("Valid name entered");
			} else {
				System.err.println("Invalid name entered");
				return false;
			}
			if (ValidationUtil.validateString(sport)) {
				System.out.println("Valid sport entered");
			} else {
				System.err.println("Invalid sport entered");
				return false;
			}
			System.out.println(" ^_^ ");
			playerRepository.save(playerDTO);
			return true;

		}
		return false;
	}

	@Override
	public PlayerDTO findByName(String name) {
		boolean foundName = ValidationUtil.validateString(name);
		if (foundName) {
			System.out.println("Valid name entered");
			PlayerDTO foundValues = playerRepository.findByName(name);
			return foundValues;

		}
		System.err.println("Invalid name entered");
		return null;
	}

	@Override
	public PlayerDTO findByNameAndSportName(String name, String sportName) {
		boolean foundName = ValidationUtil.validateString(name);
		boolean foundSport = ValidationUtil.validateString(sportName);
		if (foundName && foundSport) {
			System.out.println("Valid data entered");
			PlayerDTO foundValues = playerRepository.findByNameAndSportName(name, sportName);
			return foundValues;

		}
		System.err.println("Invalid name entered");
		return null;
	}

}
