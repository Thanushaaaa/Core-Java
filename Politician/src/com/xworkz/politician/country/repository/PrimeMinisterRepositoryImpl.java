package com.xworkz.politician.country.repository;

import com.xworkz.politician.country.dto.PrimeMinisterDTO;

public class PrimeMinisterRepositoryImpl implements PrimeMinisterRepository {
	private PrimeMinisterDTO[] primeMinisterDTO1 = new PrimeMinisterDTO[NO_OF_POLITICIANS];
	private int start = 0;

	@Override
	public void save(PrimeMinisterDTO primeMinisterDTO) {
		if (start < primeMinisterDTO1.length) {
			System.out.println("Invoking save in prime minister repository implementation");
			primeMinisterDTO1[start] = primeMinisterDTO;
			System.out.println("Data is stored at index " + start);
			System.out.println("Data stored is " + primeMinisterDTO1[start]);
			this.start++;
		} else {
			System.err.println("Array is full,can't store");
		}

	}

	@Override
	public PrimeMinisterDTO findByName(String name) {

		for (int index = 0; index < start; index++) {
			if (primeMinisterDTO1[index].getName() == name) {
				System.out.println("Prime minister details found");
				return primeMinisterDTO1[index];
			}
			System.out.println("Prime minister not found at current index,moving to next index");

		}
		System.out.println("Prime minister details not found");
		return null;
	}

}
