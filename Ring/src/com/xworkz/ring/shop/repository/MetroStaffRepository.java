package com.xworkz.ring.shop.repository;

import com.xworkz.ring.shop.dto.MetroStaffDTO;

public interface MetroStaffRepository {
	int NO_OF_WORKERS = 5;

	void save(MetroStaffDTO metroStaffDTO);

	MetroStaffDTO findByName(String name);

	MetroStaffDTO findBySalary(int salary);

	MetroStaffDTO findByLocation(String location);

	MetroStaffDTO[] readAll();

}
