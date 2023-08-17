package com.xworkz.ring.shop.repository;

import com.xworkz.ring.shop.dto.PilotDTO;

public class PilotRepositoryImpl implements PilotRepository {
	private PilotDTO[] pilotDTO1 = new PilotDTO[NO_OF_CANDIDATES];
	private int start = 0;

	@Override
	public void save(PilotDTO pilotDTO) {
		if (start < NO_OF_CANDIDATES) {
			System.out.println("Invoking save method in theater repository implementation");
			System.out.println("The values stored at index " + start + " are " + pilotDTO);
			this.pilotDTO1[start] = pilotDTO;
			start++;

		} else {
			System.out.println("Can't store values,array is full");
		}

	}

}
