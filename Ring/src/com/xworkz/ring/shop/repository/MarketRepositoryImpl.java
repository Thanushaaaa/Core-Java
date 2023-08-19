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
			System.err.println("Can't store,array is full");
		}

	}

	@Override
	public MarketDTO findByLocation(String name) {
		for (int start = 0; start < position; start++) {
			if (marketDTO[start].getLocation().equals(name)){
				System.out.println("Invoking find by location in market repository implementation");
				return marketDTO[start];
			}
			System.out.println("can't find,moving to the next index");
		}
		System.err.println("market not found");
		return null;

	}

	@Override
	public MarketDTO findByOwner(String name) {
		for (int start = 0; start < position; start++) {
			if (marketDTO[start].getOwner().equals(name)) {
				System.out.println("Invoking find by owner in market repository implementation");
				return marketDTO[start];
			}
			System.out.println("can't find,moving to the next index");
		}
		System.err.println("market not found");
		return null;

	}

	@Override
	public MarketDTO findByDiscount(int discount) {
		for (int start = 0; start < position; start++) {
			if (marketDTO[start].getDiscount() == discount) {
				System.out.println("Invoking find by discount in market repository implementation");
				return marketDTO[start];
			}
			System.out.println("can't find,moving to the next index");
		}
		System.err.println("market not found");
		return null;
	}

	@Override
	public MarketDTO[] readAll() {

		return marketDTO;
	}

}
