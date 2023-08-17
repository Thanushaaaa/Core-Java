package com.xworkz.ring.shop.runner;

import com.xworkz.ring.shop.dto.PilotDTO;
import com.xworkz.ring.shop.repository.*;

public class PilotRunner {

	public static void main(String[] args) {
		PilotDTO pilotDTO = new PilotDTO("Vinay", 30, 6.0, 55, "Neha");
		System.out.println(pilotDTO);

		PilotDTO pilotDTO2 = new PilotDTO("Kiran", 26, 5.5, 45, "Aksitha");
		System.out.println(pilotDTO2);

		PilotDTO pilotDTO3 = new PilotDTO("Rana", 27, 5.8, 49, "Rashmi");
		System.out.println(pilotDTO3);

		PilotDTO pilotDTO4 = new PilotDTO("Prabhas", 25, 6.3, 68, "Sara");
		System.out.println(pilotDTO4);

		PilotDTO pilotDTO5 = new PilotDTO("Virat", 29, 5.5, 58, "Anushka");
		System.out.println(pilotDTO5);

		PilotRepository pilotRepository = new PilotRepositoryImpl();
		pilotRepository.save(pilotDTO);
		pilotRepository.save(pilotDTO2);
		pilotRepository.save(pilotDTO3);
		pilotRepository.save(pilotDTO4);
		pilotRepository.save(pilotDTO5);

	}

}
