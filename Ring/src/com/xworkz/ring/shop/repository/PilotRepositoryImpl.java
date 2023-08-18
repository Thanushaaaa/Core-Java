package com.xworkz.ring.shop.repository;

import com.xworkz.ring.shop.dto.PilotDTO;

public class PilotRepositoryImpl implements PilotRepository {
	private PilotDTO[] pilotDTO1 = new PilotDTO[NO_OF_CANDIDATES];
	private int start = 0;

	@Override
	public void save(PilotDTO pilotDTO) {
		if (start < NO_OF_CANDIDATES) {
			System.out.println("Invoking save method in pilot repository implementation");
			System.out.println("The values stored at index " + start + " are " + pilotDTO);
			this.pilotDTO1[start] = pilotDTO;
			start++;

		} else {
			System.err.println("Can't store values,array is full");
		}

	}

	@Override
	public PilotDTO findByName(String name) {
		for (int index = 0; index < start; index++) {
			if (pilotDTO1[index].getName() == name) {
				System.out.println("Invoking find by name in pilot repository implementation");
				return pilotDTO1[index];

			}
			System.out.println("pilot not found,moving to next index");
		}
		System.err.println("pilot not found");
		return null;

	}

	@Override
	public PilotDTO findByAge(int age) {
		for (int index = 0; index < start; index++) {
			if (pilotDTO1[index].getAge() == age) {
				System.out.println("Invoking find by age in pilot repository implementation");
				return pilotDTO1[index];

			}
			System.out.println("pilot not found,moving to next index");
		}
		System.err.println("pilot not found");
		return null;

	}

	@Override
	public PilotDTO findByPartnerName(String partnerName) {
		for (int index = 0; index < start; index++) {
			if (pilotDTO1[index].getPartnerName() == partnerName) {
				System.out.println("Invoking find by partner name in pilot repository implementation");
				return pilotDTO1[index];

			}
			System.out.println("pilot not found,moving to next index");
		}
		System.err.println("pilot not found");
		return null;

	}

	@Override
	public PilotDTO[] readAll() {

		return pilotDTO1;
	}

}
