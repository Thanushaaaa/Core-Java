package com.xworkz.ring.shop.repository;

import com.xworkz.ring.shop.dto.CustomerDTO;

public class CustomerRepositoryImpl implements CustomerRepository {
	private CustomerDTO[] customerDTO = new CustomerDTO[NO_OF_CUSTOMERS];
	private int index = 0;

	@Override
	public void save(CustomerDTO customerDTO) {
		if (index < NO_OF_CUSTOMERS) {
			System.out.println("Invoking save method in customer repository");
			System.out.println("The values stored at " + index + " are " + customerDTO);
			this.customerDTO[index] = customerDTO;
			index++;
		} else {
			System.out.println("Array is full,can't store");
		}

	}

}
