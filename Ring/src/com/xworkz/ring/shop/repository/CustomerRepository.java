package com.xworkz.ring.shop.repository;

import com.xworkz.ring.shop.dto.CustomerDTO;

public interface CustomerRepository {
	int NO_OF_CUSTOMERS = 5;

	void save(CustomerDTO customerDTO);
	CustomerDTO findByName(String name);
	CustomerDTO findByAge(int age);
	CustomerDTO findByBill(int bill);
	CustomerDTO[] readAll();
	

}
