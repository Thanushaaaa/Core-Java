package com.xworkz.laptop.mouse.repository;

import com.xworkz.laptop.mouse.dto.HospitalDTO;

public class HospitalRepositoryImpl implements HospitalRepository {
	private static final String patients = null;
	private HospitalDTO[] hospitalDTO1 = new HospitalDTO[NO_OF_HOSPITALS];
	private int index = 0;

	@Override
	public void save(HospitalDTO hospitalDTO) {
		if (index < NO_OF_HOSPITALS) {
			System.out.println("Invoking save in hospital repository implementation");
			this.hospitalDTO1[index] = hospitalDTO;
			System.out.println("Data stored is at index " + index);
			this.index++;
		} else {
			System.err.println("Can't store, array is full");
		}

	}

	@Override
	public HospitalDTO findByName(String name) {

		for (int count = 0; count < index; count++) {
			if (hospitalDTO1[count].getName().equalsIgnoreCase(name)) {
				System.out.println("Hospital found");
				return hospitalDTO1[count];

			}
			System.out.println("Moving to next index");
		}
		System.err.println("Hospital not found");
		return null;
	}

	@Override
	public HospitalDTO findByNameAndPatients(String name, int noOfPatients) {
		for (int count = 0; count < index; count++) {
			if (hospitalDTO1[count].getName().equals(name) && hospitalDTO1[count].getNoOfPatients() == noOfPatients) {
				System.out.println("Hospital found");
				return hospitalDTO1[count];

			}
			System.out.println("Moving to next index");
		}
		System.err.println("Hospital not found");
		return null;

	}

}
