package com.xworkz.ring.shop.runner;

import com.xworkz.ring.shop.dto.MetroStaffDTO;
import com.xworkz.ring.shop.repository.*;

public class MetroStaffRunner {

	public static void main(String[] args) {
		MetroStaffDTO metroStaffDTO1 = new MetroStaffDTO("Anand", 10000, "Hyd", 23, 8);
		System.out.println(metroStaffDTO1);

		MetroStaffDTO metroStaffDTO2 = new MetroStaffDTO("Chandu", 20000, "Banglore", 30, 6);
		System.out.println(metroStaffDTO2);

		MetroStaffDTO metroStaffDTO3 = new MetroStaffDTO("Lucky", 15000, "Mumbai", 24, 7);
		System.out.println(metroStaffDTO3);

		MetroStaffDTO metroStaffDTO4 = new MetroStaffDTO("Nandu", 14000, "Chennai", 25, 5);
		System.out.println(metroStaffDTO4);

		MetroStaffDTO metroStaffDTO5 = new MetroStaffDTO("Jackson", 16000, "Kolkata", 29, 7);
		System.out.println(metroStaffDTO5);

		MetroStaffRepository metroStaffRepository = new MetroStaffRepositoryImpl();
		metroStaffRepository.save(metroStaffDTO1);
		metroStaffRepository.save(metroStaffDTO2);
		metroStaffRepository.save(metroStaffDTO3);
		metroStaffRepository.save(metroStaffDTO4);
		metroStaffRepository.save(metroStaffDTO5);

	}

}
