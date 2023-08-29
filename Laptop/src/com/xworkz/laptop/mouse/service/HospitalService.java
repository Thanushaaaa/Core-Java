package com.xworkz.laptop.mouse.service;

import com.xworkz.laptop.mouse.dto.HospitalDTO;

public interface HospitalService {
	boolean validateAndSave(HospitalDTO hospitalDTO);

	HospitalDTO findByName(String name);

	HospitalDTO findByNameAndPatients(String name, int noOfPatients);

}
