package com.xworkz.clock.titan;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.xworkz.laptop.mouse.util.HospitalDTO;

public class HospitalDTORunner {

	public static void main(String[] args) {
		AbstractDTO abstractDTO = new HospitalDTO();
		abstractDTO.setWhenCreated(LocalDate.now());
		abstractDTO.setWhenUpdated(LocalDate.now());
		abstractDTO.setWhoCreated("Salman Khan");
		abstractDTO.setWhoUpdated("Deepika");
		LocalDateTime ldt = LocalDateTime.now();
		abstractDTO.setUpdatedTime(ldt);
		System.out.println(abstractDTO);
	}

}
