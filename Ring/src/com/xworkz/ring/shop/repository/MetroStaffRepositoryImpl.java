package com.xworkz.ring.shop.repository;

import com.xworkz.ring.shop.dto.MetroStaffDTO;

public class MetroStaffRepositoryImpl implements MetroStaffRepository {
	private MetroStaffDTO[] metroStaffDTO = new MetroStaffDTO[NO_OF_WORKERS];
	private int index = 0;

	@Override
	public void save(MetroStaffDTO metroStaffDTO) {
		if (index < NO_OF_WORKERS) {
			System.out.println("Invoking save in metro staff repository implementation");
			System.out.println("The values are stored at " + index + " are " + metroStaffDTO);
			this.metroStaffDTO[index] = metroStaffDTO;
			index++;
		} else {
			System.err.println("Array is full,can't store");
		}

	}

	@Override
	public MetroStaffDTO findByName(String name) {
		for (int start = 0; start < index; start++) {
			if (metroStaffDTO[start].getName() == name) {
				System.out.println("Invoking find by name in metro staff repository implementation");
				return metroStaffDTO[start];

			}
			System.out.println("person not found,moving to next index");
		}
		System.err.println("person not found");
		return null;

	}

	@Override
	public MetroStaffDTO findBySalary(int salary) {
		for (int start = 0; start < index; start++) {
			if (metroStaffDTO[start].getSalary() == salary) {
				System.out.println("Invoking find by salary in metro staff repository implementation");
				return metroStaffDTO[start];

			}
			System.out.println("person not found,moving to next index");
		}
		System.err.println("person not found");
		return null;

	}

	@Override
	public MetroStaffDTO findByLocation(String location) {
		for (int start = 0; start < index; start++) {
			if (metroStaffDTO[start].getLocation() == location) {
				System.out.println("Invoking find by location in metro staff repository implementation");
				return metroStaffDTO[start];

			}
			System.out.println("person not found,moving to next index");
		}
		System.err.println("person not found");
		return null;

	}

	@Override
	public MetroStaffDTO[] readAll() {
		return metroStaffDTO;

	}

}
