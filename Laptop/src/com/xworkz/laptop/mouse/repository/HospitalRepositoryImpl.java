package com.xworkz.laptop.mouse.repository;

import com.xworkz.laptop.mouse.dto.HospitalDTO;

public class HospitalRepositoryImpl implements HospitalRepository {
	private HospitalDTO[] hospitalDTO1=new HospitalDTO[NO_OF_HOSPITALS];
	private int index=0;

	@Override
	public void save(HospitalDTO hospitalDTO) {
		if(index<NO_OF_HOSPITALS)
		{
			System.out.println("Invoking save in hospital repository implementation");
			this.hospitalDTO1[index]=hospitalDTO;
			System.out.println("Data stored is at index "+index);
			this.index++;
		}
		else
		{
			System.out.println("Can't store, array is full");
		}
		
		
	}
	
	

}
