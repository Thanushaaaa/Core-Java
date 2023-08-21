package com.xworkz.room.service;

import com.xworkz.room.dto.MechanicDTO;

public class MechanicServiceImpl implements MechanicService{

	@Override
	public void validateAndSave(MechanicDTO mechanicDTO) {
		if(mechanicDTO!=null)
		{
			System.out.println("Valid data,can continue "+mechanicDTO);
			String garageName=mechanicDTO.getGarageName();
			String gstNo=mechanicDTO.getGstNo();
			String specialization=mechanicDTO.getSpecialization();
			int bikeServiceCharge=mechanicDTO.getBikeServiceCharge();
			if(garageName!=null&&!garageName.isEmpty()&&garageName.length()>0&&garageName.length()<100)
			{
				System.out.println("Valid garage name entered "+garageName);
			}
			else
			{
				System.err.println("Invalid garage name entered "+garageName);
			}
			if(gstNo!=null&&!gstNo.isEmpty()&&gstNo.length()>0&&gstNo.length()<100)
			{
				System.out.println("Valid Gst no entered "+gstNo);
			}
			else
			{
				System.err.println("Invalid Gst no entered "+gstNo);
			}
			if(specialization!=null&&!specialization.isEmpty()&&specialization.length()>0&&specialization.length()<100)
			{
				System.out.println("Valid specialization entered "+specialization);
			}
			else
			{
				System.err.println("Invalid specialization entered "+specialization);
			}
			if(bikeServiceCharge!=0&&bikeServiceCharge>0&&bikeServiceCharge<2000)
			{
				System.out.println("Valid bike service charge entered "+bikeServiceCharge);
			}
			else
			{
				System.err.println("Invalid bike service charge entered "+bikeServiceCharge);
			}
			
		}
		else
		{
			System.err.println("Please enter valid data");
		}
		
	}
	

}
