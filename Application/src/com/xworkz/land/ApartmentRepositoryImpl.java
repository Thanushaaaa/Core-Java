package com.xworkz.land;

public class ApartmentRepositoryImpl implements ApartmentRepository{
	private String[] owners=new String[CAPACITY];
	int index=0;
	@Override
	public void save(String name) {
		if(index<CAPACITY)
		{   
			
			System.out.println("The element is stored at "+index+" is "+name);
			this.owners[index]=name;
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
		for(int start=0;start<owners.length;start++) {
			System.out.println("The element stored at "+start+" is "+owners[start]);
		}
	}

}
