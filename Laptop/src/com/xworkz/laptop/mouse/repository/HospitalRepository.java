package com.xworkz.laptop.mouse.repository;

import com.xworkz.laptop.mouse.dto.HospitalDTO;

public interface HospitalRepository {
	int NO_OF_HOSPITALS = 5;

	void save(HospitalDTO hospitalDTO);

	HospitalDTO findByName(String name);

	HospitalDTO findByNameAndPatients(String name, int noOfPatients);

}
