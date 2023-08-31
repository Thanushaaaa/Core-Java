package com.xworkz.politician.country.service;

import com.xworkz.politician.country.util.ValidationUtil;
import com.xworkz.politician.country.dto.PrimeMinisterDTO;
import com.xworkz.politician.country.repository.PrimeMinisterRepository;

public class PrimeMinisterServiceImpl implements PrimeMinisterService {
	private PrimeMinisterRepository primeMinisterRepository;

	public PrimeMinisterServiceImpl(PrimeMinisterRepository primeMinisterRepository) {
		this.primeMinisterRepository = primeMinisterRepository;
	}

	@Override
	public boolean validateAndSave(PrimeMinisterDTO primeMinisterDTO) {
		if (primeMinisterDTO != null) {
			System.out.println("Invoking validate and save in prime minister implementation");
			System.out.println("Data entered is " + primeMinisterDTO);
			String name = primeMinisterDTO.getName();
			String country = primeMinisterDTO.getCountry();
			String partyName = primeMinisterDTO.getPartyName();
			int id = primeMinisterDTO.getId();
			if (ValidationUtil.validateString(name)) {
				System.out.println("Valid name entered");
			} else {
				System.err.println("Invalid name entered");
				return false;
			}
			if (ValidationUtil.validateString(country)) {
				System.out.println("Valid country entered");
			} else {
				System.err.println("Invalid country entered");
				return false;
			}
			if (ValidationUtil.validateString(partyName)) {
				System.out.println("Valid party name entered");
			} else {
				System.err.println("Invalid party name entered");
				return false;
			}
			if (ValidationUtil.validateInt(id)) {
				System.out.println("Valid Id entered");
			} else {
				System.err.println("Invalid Id entered");
				return false;
			}
			System.out.println(" :) ");
			primeMinisterRepository.save(primeMinisterDTO);
			return true;
		}
		return false;

	}

	@Override
	public PrimeMinisterDTO findByName(String name) {
		if (ValidationUtil.validateString(name)) {
			System.out.println("Invoking find by name in prime minister implementation");
			PrimeMinisterDTO PrimeMinisterDTO2 = primeMinisterRepository.findByName(name);
			return PrimeMinisterDTO2;

		}
		System.err.println("Invalid name enterd");
		return null;
	}

}
