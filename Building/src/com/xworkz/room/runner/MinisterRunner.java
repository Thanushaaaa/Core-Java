package com.xworkz.room.runner;
import com.xworkz.room.service.*;
import com.xworkz.room.dto.MinisterDTO;

public class MinisterRunner {

	public static void main(String[] args) {
		MinisterDTO ministerDTO=new MinisterDTO("Shivanand Patil",20,"Deputy CM","Indian National Congress");
		
		MinisterService ministerService=new MinisterServiceImpl();
		ministerService.validateAndSave(ministerDTO);

	}

}
