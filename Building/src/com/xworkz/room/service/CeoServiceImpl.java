package com.xworkz.room.service;

import com.xworkz.room.dto.CeoDTO;

public class CeoServiceImpl implements CeoService{

	@Override
	public void validateAndSave(CeoDTO ceoDTO) {
		if(ceoDTO!=null)
		{
			System.out.println("Valid data,can continue "+ceoDTO);
			String name=ceoDTO.getName();
			String companyName=ceoDTO.getCompanyName();
			long salary=ceoDTO.getSalary();
			int experience=ceoDTO.getExperience();
			if(name!=null&&!name.isEmpty()&&name.length()>3&&name.length()<100)
			{
				System.out.println("Valid name entered "+name);
			}
			else
			{
				System.err.println("Invalid name entered "+name);
			}
			if(companyName!=null&&!companyName.isEmpty()&&companyName.length()>3&&companyName.length()<100)
			{
				System.out.println("Valid company name entered "+companyName);
			}
			else
			{
				System.err.println("Invalid company name entered "+companyName);
			}
			if(salary!=0&&salary>20000&&salary<1000000)
			{
				System.out.println("Valid salary entered "+salary);
			}
			else
			{
				System.err.println("Invalid salary entered "+salary);
			}
			if(experience!=0&&experience>0&&experience<150)
			{
				System.out.println("Valid experience entered "+experience);
			}
			else
			{
				System.err.println("Invalid experience entered "+experience);
			}
		}
			else
			{
				System.err.println("Please enter valid data");
			}
			
		
		
		
	}

}
