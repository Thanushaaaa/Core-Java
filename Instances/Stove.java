class Stove
{
	double length;
	boolean electricStove;
	String fuelType;
	double weight;
	int noOfBurners;
	int capacity;
	int price;
	double width;


	
	Stove(double length,boolean electricStove,String fuelType,double weight,int noOfBurners,int capacity,int price,double width)
	{
		System.out.println("Running String,int,int,int,double,double,double,boolean Consts in Stove");
		this.length=length;
		this.electricStove=electricStove;
		this.fuelType=fuelType;
		this.weight=weight;
		this.noOfBurners=noOfBurners;
		this.capacity=capacity;
		this.price=price;
		this.width=width;
		
		
	}
}