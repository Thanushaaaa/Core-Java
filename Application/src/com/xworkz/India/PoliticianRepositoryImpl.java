package com.xworkz.India;

public class PoliticianRepositoryImpl implements PoliticianRepository{
	String[] names=new String[COUNT];
	int index=0;

	@Override
	public void save(String name) {
		if(index<COUNT)
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
		for(int start=0;start<names.length;start++) {
			System.out.println("The element stored at "+start+" is "+names[start]);
		}
	}
	@Override
	public String findStartswith(String name)
	{
		for(int first=0;first<names.length;first++)
		{
			String string=this.names[first];
			first=first+1;
			if(string.startsWith(name))
			{
				
				return string;
				
				
			}
			
		}
		return null;
		
		
		
	}
			
		
		
		

}
