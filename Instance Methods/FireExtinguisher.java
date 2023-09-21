class FireExtinguisher{
	int price;
	String color;
	int quantity;
	String type;
	String brand;
	FireExtinguisher(int price,String color,int quantity,String type,String brand)
	{
		System.out.println("Fire extingusher 1");
		this.price=price;
		this.color=color;
		this.quantity=quantity;
		this.type=type;
		this.brand=brand;
	}
	void aboutFireExtinguisher()
	{
		System.out.println("price : "+price);
		System.out.println("color : "+color);
		System.out.println("quantity : "+quantity);
		System.out.println("type : "+type);
		System.out.println("brand : "+brand);
	}
}
	
	
	
	