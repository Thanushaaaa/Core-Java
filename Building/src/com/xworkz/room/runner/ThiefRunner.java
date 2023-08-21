package com.xworkz.room.runner;

import com.xworkz.room.service.*;
import com.xworkz.room.dto.ThiefDTO;

public class ThiefRunner {

	public static void main(String[] args) {
		ThiefDTO thiefDTO = new ThiefDTO("Vehicle robbery", 25, 10, "Eagle", 90);

		ThiefService thiefService = new ThiefServiceImpl();
		thiefService.validateAndSave(thiefDTO);

	}

}
