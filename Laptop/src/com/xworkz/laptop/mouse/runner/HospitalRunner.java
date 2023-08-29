package com.xworkz.laptop.mouse.runner;

import com.xworkz.laptop.mouse.dto.HospitalDTO;
import com.xworkz.laptop.mouse.service.*;

public class HospitalRunner {

	public static void main(String[] args) {

		HospitalDTO hospitalDTO = new HospitalDTO("Jayadeva", 8909, "Manjunath", "Bengaluru");
		HospitalService hospitalService = new HospitalServiceImpl();
		boolean stored = hospitalService.validateAndSave(hospitalDTO);
		if (stored) {
			System.out.println("saved " + stored);
		} else {
			System.err.println("not saved " + stored);
		}
		HospitalDTO found = hospitalService.findByName("Jayadeva");
		System.out.println(found);

		HospitalDTO found1 = hospitalService.findByNameAndPatients("Jayadeva", 8909);
		System.out.println(found1);

	}

}
