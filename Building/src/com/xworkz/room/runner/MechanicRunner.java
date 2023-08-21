package com.xworkz.room.runner;

import com.xworkz.room.dto.MechanicDTO;
import com.xworkz.room.service.*;
public class MechanicRunner {

	public static void main(String[] args) {
		MechanicDTO mechanicDTO=new MechanicDTO("Architha motors","Breaks and transmission",700,"37AAACP2678Q1ZP");
		
		MechanicService mechanicService=new MechanicServiceImpl();
		mechanicService.validateAndSave(mechanicDTO);

	}

}
