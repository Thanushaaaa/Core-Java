package com.xworkz.ring.shop.runner;

import com.xworkz.ring.shop.repository.*;
import com.xworkz.ring.shop.dto.*;
import com.xworkz.ring.shop.repository.TheaterRepositoryImpl;

public class TheaterRunner {
	public static void main(String[] args) {
		TheaterDTO theaterDTO = new TheaterDTO("Sandhya", 800, "BTM", 150, "Vicky");
		System.out.println(theaterDTO);

		TheaterDTO theaterDTO2 = new TheaterDTO("PVR", 700, "Electronic city", 200, "Vineeth");
		System.out.println(theaterDTO2);

		TheaterDTO theaterDTO3 = new TheaterDTO("Gopalan", 750, "Jayanagar", 170, "Anand");
		System.out.println(theaterDTO3);

		TheaterDTO theaterDTO4 = new TheaterDTO("Lakshmi", 800, "Hebbal", 300, "Kaushik");
		System.out.println(theaterDTO4);

		TheaterDTO theaterDTO5 = new TheaterDTO("Balaji", 900, "Silk board", 350, "Vivek");
		System.out.println(theaterDTO5);

		TheaterRepository theaterRepository = new TheaterRepositoryImpl();
		theaterRepository.save(theaterDTO);
		theaterRepository.save(theaterDTO2);
		theaterRepository.save(theaterDTO3);
		theaterRepository.save(theaterDTO4);
		theaterRepository.save(theaterDTO5);

		TheaterDTO theaterDTO6 = theaterRepository.findByName("PVR");
		System.out.println(theaterDTO6);

		TheaterDTO theaterDTO7 = theaterRepository.findByOwnerName("Anand");
		System.out.println(theaterDTO7);

		TheaterDTO theaterDTO8 = theaterRepository.findByCapacity(150);
		System.out.println(theaterDTO8);

		TheaterDTO[] theaterDTO9 = theaterRepository.readAll();
		for (int index = 0; index < theaterDTO9.length; index++) {
			if (theaterDTO9[index] != null) {

				System.out.println(theaterDTO9[index]);
			}

		}

	}

}
