package com.xworkz.room.service;

import com.xworkz.room.dto.MinisterDTO;

public class MinisterServiceImpl implements MinisterService {

	@Override
	public void validateAndSave(MinisterDTO ministerDTO) {
		if(ministerDTO!=null)
		{
			System.out.println("Valid data entered,can continue "+ministerDTO);
			String name=ministerDTO.getName();
			int experience=ministerDTO.getExperience();
			String designation=ministerDTO.getDesignation();
			String partyName=ministerDTO.getPartyName();
			if(name!=null&&!name.isEmpty()&&name.length()>3&&name.length()<100)
			{
				System.out.println("Valid name entered "+name);
			}
			else
			{
				System.err.println("Invalid name entered "+name);
			}
			if(experience!=0&&experience>0&&experience<50)
			{
				System.out.println("Valid experience entered "+experience);
			}
			else
			{
				System.err.println("Invalid experience entered "+experience);
			}
			if(designation!=null&&!designation.isEmpty()&&designation.length()>3&&designation.length()<100)
			{
				System.out.println("Valid designation entered "+designation);
			}
			else
			{
				System.err.println("Invalid designation entered "+designation);
			}
			if(partyName!=null&&!partyName.isEmpty()&&partyName.length()>3&&partyName.length()<100)
			{
				System.out.println("Valid party name entered "+partyName);
			}
			else
			{
				System.out.println("Invalid party name entered "+partyName);
			}
			}
		
		else
		{
			System.out.println("Please enter valid data");
		}

	}
}
	
				


