package com.xworkz.politician.country.repository;

import com.xworkz.politician.country.dto.PrimeMinisterDTO;

public interface PrimeMinisterRepository {
	
	int NO_OF_POLITICIANS=5;

	void save(PrimeMinisterDTO primeMinisterDTO);

	PrimeMinisterDTO findByName(String name);

}
