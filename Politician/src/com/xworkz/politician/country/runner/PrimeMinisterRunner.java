package com.xworkz.politician.country.runner;

import com.xworkz.politician.country.dto.PrimeMinisterDTO;
import com.xworkz.politician.country.repository.PrimeMinisterRepository;
import com.xworkz.politician.country.repository.PrimeMinisterRepositoryImpl;
import com.xworkz.politician.country.service.*;

public class PrimeMinisterRunner {

	public static void main(String[] args) {
		PrimeMinisterDTO primeMinisterDTO = new PrimeMinisterDTO("Rishi Sunak", "Britain", 1, "Conservative Party");
		PrimeMinisterRepository primeMinisterRepository = new PrimeMinisterRepositoryImpl();
		PrimeMinisterService primeMinisterService = new PrimeMinisterServiceImpl(primeMinisterRepository);
		boolean isSaved = primeMinisterService.validateAndSave(primeMinisterDTO);
		if (isSaved) {
			System.out.println("Data is saved " + isSaved);
		} else {
			System.err.println("Data is not saved");
		}
		PrimeMinisterDTO found = primeMinisterService.findByName("Rishi Sunak");
		System.out.println(found);
	}

}
