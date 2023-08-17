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
			System.out.println("Can't store values,array is full");
		}

	}

}
