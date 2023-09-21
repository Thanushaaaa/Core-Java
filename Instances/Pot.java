class Pot{
	String color;
	int price;
	int volume;
	int height;
	boolean inGoodCondition;
	String use;
	String material;
	int durability;
	Pot(String color,int price,int volume,int height,boolean inGoodCondition,String use,String material,int durability)
	{
		System.out.println("Running String,int,int,boolean,String,String,String,int");
		this.color=color;
		this.price=price;
		this.volume=volume;
		this.height=height;
		this.inGoodCondition=inGoodCondition;
		this.use=use;
		this.material=material;
		this.durability=durability;
	}
}