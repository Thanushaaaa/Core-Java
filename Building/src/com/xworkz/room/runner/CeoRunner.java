package com.xworkz.room.runner;

import com.xworkz.room.dto.CeoDTO;
import com.xworkz.room.service.*;
public class CeoRunner {

	public static void main(String[] args) {
		CeoDTO ceoDTO=new CeoDTO("Elon Musk","Tesla",876535192,45);
		CeoService ceoService=new CeoServiceImpl();
		ceoService.validateAndSave(ceoDTO);

	}

}
