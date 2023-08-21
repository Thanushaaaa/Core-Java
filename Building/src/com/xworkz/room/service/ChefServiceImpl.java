package com.xworkz.room.service;

import com.xworkz.room.dto.ChefDTO;

public class ChefServiceImpl implements ChefService {

	@Override
	public void validateAndSave(ChefDTO chefDTO) {
		if(chefDTO!=null)
		{
			System.out.println("Valid data,can continue "+chefDTO);
			String specialization=chefDTO.getSpecialization();
			String hotelName=chefDTO.getHotelName();
			String gender=chefDTO.getGender();
			long salary=chefDTO.getSalary();
			if(specialization!=null&&!specialization.isEmpty()&&specialization.length()>3&&specialization.length()<100)
			{
				System.out.println("Valid specialization entered "+specialization);
			}
			else
			{
				System.err.println("Invalid specialization entered "+specialization);
			}
			if(hotelName!=null&&!hotelName.isEmpty()&&hotelName.length()>3&&hotelName.length()<100)
			{
				System.out.println("Valid hotel name entered "+hotelName);
			}
			else
			{
				System.err.println("Invalid hotel name entered "+hotelName);
			}
			if(gender!=null&&!gender.isEmpty()&&gender.equals("male")||gender.equals("female")||gender.equals("Other"))
			{
				System.out.println("Valid gender entered "+gender);
			}
			else
			{
				System.err.println("Invalid gender entered "+gender);
			}
			if(salary!=0&&salary>10000&&salary<7745756)
			{
				System.out.println("Valid salary entered "+salary);
			}
			else
			{
				System.err.println("Invalid salary entered "+salary);
			}
			
		}
		else
		{
			System.err.println("Please enter valid data");
		}

	}

}
