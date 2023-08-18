package com.xworkz.ring.shop.repository;

import com.xworkz.ring.shop.dto.MarketDTO;

public interface MarketRepository {
	int NO_OF_MARKETS = 5;

	void save(MarketDTO marketDTO);
	MarketDTO findByLocation(String name);
	MarketDTO findByOwner(String name);
	MarketDTO findByDiscount(int discount);
	MarketDTO[] readAll();

}
