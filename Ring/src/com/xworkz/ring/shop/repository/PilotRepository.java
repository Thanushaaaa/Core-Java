package com.xworkz.ring.shop.repository;

import com.xworkz.ring.shop.dto.PilotDTO;

public interface PilotRepository {
	int NO_OF_CANDIDATES = 5;

	void save(PilotDTO pilotDTO);

}
