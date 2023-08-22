package com.xworkz.laptop.mouse.service;

import com.xworkz.laptop.mouse.dto.HospitalDTO;
import com.xworkz.laptop.mouse.repository.HospitalRepository;
import com.xworkz.laptop.mouse.repository.HospitalRepositoryImpl;
import com.xworkz.laptop.mouse.util.ValidationUtil;

public class HospitalServiceImpl implements HospitalService {

	@Override
	public boolean validateAndSave(HospitalDTO hospitalDTO) {
		if(hospitalDTO!=null)
		{
			System.out.println("Invoking valid and save in hospital service implementation");
			System.out.println("Valid data entered "+hospitalDTO);
			String name=hospitalDTO.getName();
			String location=hospitalDTO.getLocation();
			String ownerName=hospitalDTO.getOwnerName();
			int patients=hospitalDTO.getNoOfPatients();
			if(ValidationUtil.validateString(name))
			{
				System.out.println("Valid name entered ");
			}
			else
			{
				System.err.println("Invalid name entered ");
				return false;
			}
			if(ValidationUtil.validateString(location))
			{
				System.out.println("Valid location entered ");
			}
			else
			{
				System.err.println("Invalid location entered ");
				return false;
			}
			if(ValidationUtil.validateString(ownerName))
			{
				System.out.println("Valid owner name entered ");
			}
			else
			{
				System.err.println("Invalid owner name entered ");
				return false;
			}
			if(patients>0&&patients<10000)
			{
				System.out.println("Valid patients entered ");
			}
			else
			{
				System.err.println("Invalid patients entered ");
				return false;
			}
			System.out.println("^_^ ^_^ ^_^");
			HospitalRepository hospitalRepository=new HospitalRepositoryImpl();
			hospitalRepository.save(hospitalDTO);
			return true;

			
		}
		else
		{
			System.err.println("Please enter valid data");
		}
		
		return false;
		
	}

}
