package com.xworkz.politician.country.repository;

import com.xworkz.politician.country.dto.PrimeMinisterDTO;

public interface PrimeMinisterRepository {

	void save(PrimeMinisterDTO primeMinisterDTO);

	PrimeMinisterDTO findByName(String name);

}
