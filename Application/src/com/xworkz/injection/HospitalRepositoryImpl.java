package com.xworkz.injection;

public class HospitalRepositoryImpl implements HospitalRepository{
	String[] names=new String[NO_OF_NAMES];
	int index=0;

	@Override
	public void save(String name) {
		if(index<NO_OF_NAMES)
		{
			
			System.out.println("The element stored at "+index+" is "+name);
			this.names[index]=name;
			index=index+1;
			System.out.println("The next index is "+index);
		}
		else
		{
			System.err.println("Array is full,can't store");
		}
		
	}
	@Override
	public void display()
	{
		for(int store=0;store<names.length;store++) {
			System.out.println("The element stored at "+store+" is "+names[store]);
		}
	}
			
		
		
		

}
