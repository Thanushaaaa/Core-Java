package com.xworkz.ring.shop.repository;

import com.xworkz.ring.shop.dto.TheaterDTO;

public class TheaterRepositoryImpl implements TheaterRepository {
	private TheaterDTO[] theaterDTO1 = new TheaterDTO[NO_OF_THEATERS];
	private int start = 0;

	@Override
	public void save(TheaterDTO theaterDTO) {
		if (start < NO_OF_THEATERS) {
			System.out.println("Invoking save method in theater repository implementation");
			System.out.println("The values stored at index " + start + " are " + theaterDTO);
			this.theaterDTO1[start] = theaterDTO;
			start++;

		} else {
			System.err.println("Can't store values,array is full");
		}

	}

	@Override
	public TheaterDTO findByName(String name) {
		for (int index = 0; index < start; index++) {
			if (theaterDTO1[index].getName() == name) {

				System.out.println("Invoking find by name in theater repository implementation");
				return theaterDTO1[index];
			}
			System.out.println("theater not found,moving to next index");
		}
		System.err.println("theater not found");
		return null;
	}

	@Override
	public TheaterDTO findByOwnerName(String ownerName) {
		for (int index = 0; index < start; index++) {
			if (theaterDTO1[index].getOwnerName() == ownerName) {
				System.out.println("Invoking find by owner name in theater repository implementation");
				return theaterDTO1[index];
			}
		}

		System.err.println("theater not found");
		return null;
	}

	@Override
	public TheaterDTO findByCapacity(int capacity) {
		for (int index = 0; index < start; index++) {
			if (theaterDTO1[index].getCapacity() == capacity) {
				System.out.println("Invoking find by capacity in theater repository implementation");
				return theaterDTO1[index];
			}
		}
		System.err.println("theater not found");
		return null;
	}

	@Override
	public TheaterDTO[] readAll() {

		return theaterDTO1;
	}

}
