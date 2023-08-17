package com.xworkz.ring.shop.repository;

import com.xworkz.ring.shop.dto.CustomerDTO;

public interface CustomerRepository {
	int NO_OF_CUSTOMERS = 5;

	void save(CustomerDTO customerDTO);

}
