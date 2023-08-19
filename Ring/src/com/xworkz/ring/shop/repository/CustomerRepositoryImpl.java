package com.xworkz.ring.shop.repository;

import com.xworkz.ring.shop.dto.CustomerDTO;

public class CustomerRepositoryImpl implements CustomerRepository {
	private CustomerDTO[] customerDTO = new CustomerDTO[NO_OF_CUSTOMERS];
	private int index = 0;

	@Override
	public void save(CustomerDTO customerDTO) {
		if (index < NO_OF_CUSTOMERS) {
			System.out.println("Invoking save method in customer repository implementation");
			System.out.println("The values stored at " + index + " are " + customerDTO);
			this.customerDTO[index] = customerDTO;
			index++;
		} else {
			System.err.println("Array is full,can't store");
		}

	}

	@Override
	public CustomerDTO findByName(String name) {
		for (int start = 0; start < index; start++) {
			if (customerDTO[start].getName().equals(name)) {
				System.out.println("Invoking find by name in customer repository implementation");
				return customerDTO[start];

			}
			System.out.println("Customer not found,moving to next index");
		}
		System.err.println("Customer not found");
		return null;
	}

	@Override
	public CustomerDTO findByAge(int age) {
		for (int start = 0; start < index; start++) {
			if (customerDTO[start].getAge()==age) {
				System.out.println("Invoking find by age in customer repository implementation");
				return customerDTO[start];
			}
			System.out.println("Customer not found,moving to next index");
		}
		System.err.println("Customer not found");
		return null;

	}

	@Override
	public CustomerDTO findByBill(int bill) {
		for (int start = 0; start < index; start++) {
			if (customerDTO[start].getBill() == bill) {
				System.out.println("Invoking find by bill in customer repository implementation");
				return customerDTO[start];
			}
			System.out.println("Customer not found,moving to next index");
		}
		System.err.println("Customer not found");
		return null;

	}

	@Override
	public CustomerDTO[] readAll() {
		return customerDTO;

	}

}
