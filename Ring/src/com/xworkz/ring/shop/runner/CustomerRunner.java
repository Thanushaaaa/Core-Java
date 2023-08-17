package com.xworkz.ring.shop.runner;

import com.xworkz.ring.shop.repository.*;
import com.xworkz.ring.shop.dto.CustomerDTO;

public class CustomerRunner {

	public static void main(String[] args) {
		CustomerDTO customerDTO1 = new CustomerDTO("Parshi", 20, 5.0, 60.5, 10000);
		System.out.println(customerDTO1);

		CustomerDTO customerDTO2 = new CustomerDTO("Arya", 29, 6.0, 55, 12000);
		System.out.println(customerDTO2);

		CustomerDTO customerDTO3 = new CustomerDTO("Kajal", 22, 5.5, 62, 15000);
		System.out.println(customerDTO3);

		CustomerDTO customerDTO4 = new CustomerDTO("Ram", 26, 5.9, 64.5, 11000);
		System.out.println(customerDTO4);

		CustomerDTO customerDTO5 = new CustomerDTO("Prabhas", 28, 5.8, 63.5, 13000);
		System.out.println(customerDTO5);

		CustomerRepository customerRepository = new CustomerRepositoryImpl();
		customerRepository.save(customerDTO1);
		customerRepository.save(customerDTO2);
		customerRepository.save(customerDTO3);
		customerRepository.save(customerDTO4);
		customerRepository.save(customerDTO5);
	}

}
