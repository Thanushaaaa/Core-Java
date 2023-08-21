package com.xworkz.room.service;

import com.xworkz.room.dto.ThiefDTO;

public class ThiefServiceImpl implements ThiefService {

	@Override
	public void validateAndSave(ThiefDTO thiefDTO) {
		if (thiefDTO != null) {
			System.out.println("Valid data entered,can continue " + thiefDTO);
			String specialization = thiefDTO.getSpecialization();
			int age = thiefDTO.getAge();
			int experience = thiefDTO.getExperience();
			String gangName = thiefDTO.getGangName();
			int totalCases = thiefDTO.getTotalCases();
			if (specialization != null && !specialization.isEmpty() && specialization.length() > 3
					&& specialization.length() < 100) {
				System.out.println("Valid specialization entered " + specialization);
			} else {
				System.err.println("Invalid specialization " + specialization);
			}
			if (age != 0 && age > 0 && age < 150) {
				System.out.println("Valid age entered " + age);
			} else {
				System.err.println("Invalid age " + age);
			}
			if (experience != 0 && experience > 0 && experience < 150) {
				System.out.println("Valid experience entered " + experience);
			} else {
				System.err.println("Invalid experience " + experience);
			}
			if (gangName != null && !gangName.isEmpty() && gangName.length() > 3 && gangName.length() < 100) {
				System.out.println("Valid gang name entered " + gangName);
			} else {
				System.err.println("Invalid gang name " + gangName);
			}
			if (totalCases != 0 && totalCases > 0 && totalCases < 200) {
				System.out.println("Valid total cases entered " + totalCases);
			} else {
				System.err.println("Invalid total cases entered " + totalCases);
			}
		} else {
			System.err.println("Please enter valid data");
		}

	}

}
