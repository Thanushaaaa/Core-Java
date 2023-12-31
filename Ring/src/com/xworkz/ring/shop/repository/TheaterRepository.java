package com.xworkz.ring.shop.repository;

import com.xworkz.ring.shop.dto.TheaterDTO;

public interface TheaterRepository {

	int NO_OF_THEATERS = 5;

	void save(TheaterDTO theaterDTO);

	TheaterDTO findByName(String name);

	TheaterDTO findByOwnerName(String ownerName);

	TheaterDTO findByCapacity(int capacity);

	TheaterDTO[] readAll();

}
