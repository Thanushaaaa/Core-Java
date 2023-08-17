package com.xworkz.ring.shop.repository;

import com.xworkz.ring.shop.dto.MetroStaffDTO;

public class MetroStaffRepositoryImpl implements MetroStaffRepository {
	private MetroStaffDTO[] metroStaffDTO = new MetroStaffDTO[NO_OF_WORKERS];
	private int index = 0;

	@Override
	public void save(MetroStaffDTO metroStaffDTO) {
		if (index < NO_OF_WORKERS) {
			System.out.println("Invoking save in market repository implementation");
			System.out.println("The values are stored at " + index + " are " + metroStaffDTO);
			this.metroStaffDTO[index] = metroStaffDTO;
			index++;
		} else {
			System.out.println("Array is full,can't store");
		}

	}

}
