package com.xworkz.ring.shop.repository;

import com.xworkz.ring.shop.dto.MarketDTO;

public class MarketRepositoryImpl implements MarketRepository {
	private MarketDTO[] marketDTO = new MarketDTO[NO_OF_MARKETS];
	private int position = 0;

	@Override
	public void save(MarketDTO marketDTO) {
		if (position < NO_OF_MARKETS) {
			System.out.println("Invoking save in market repository implementation");
			System.out.println("The values stored at " + position + " are " + marketDTO);
			this.marketDTO[position] = marketDTO;
			position++;

		} else {
			System.out.println("Can't store,array is full");
		}

	}

}
