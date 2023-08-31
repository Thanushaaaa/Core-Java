package com.xworkz.politician.country.service;

import com.xworkz.politician.country.dto.PrimeMinisterDTO;

public interface PrimeMinisterService {

	boolean validateAndSave(PrimeMinisterDTO primeMinisterDTO);

	PrimeMinisterDTO findByName(String name);

}
