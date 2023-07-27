package com.xworkz.prime.Access;

public class Dosa {
	private int price;
	private String type;
	private String color;
	private String mainIngredient;
	
	
	
	public int getPrice()
	{
		return 50;
	}
	public String getType()
	{
		return "Masala dosa";
	}
	public String getColor()
	{
		return "Red";
	}
	public String getMainIngredient()
	{
		return "Masala";
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public void setType(String type)
	{
		this.type=type;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public void setMainIngredient(String mainIngredient)
	{
		this.mainIngredient=mainIngredient;
	}
	@Override
	
	public String toString()
	{
		return(" Type is "+type +" color is "+color +" Price is "+price +" Main ingredient is "+ mainIngredient);
	}

}
