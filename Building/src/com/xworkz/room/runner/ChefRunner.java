package com.xworkz.room.runner;

import com.xworkz.room.dto.ChefDTO;
import com.xworkz.room.service.*;
public class ChefRunner {

	public static void main(String[] args) {
		ChefDTO chefDTO=new ChefDTO("Continental","Taj hotel","female",7623629);
		ChefService chefService=new ChefServiceImpl();
		chefService.validateAndSave(chefDTO);
	}

}
