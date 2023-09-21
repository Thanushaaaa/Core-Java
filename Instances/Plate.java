class Plate
{   
    String color;
	boolean broken;
	String plateType;
	String shape;
	int price;
	String brand;
	double weight;
	int capacity;
	
	Plate(String color,boolean broken,String plateType,String shape,int price,String brand,double weight,int capacity)
	{
		System.out.println("Running String,Strinng,int,String,double,innt,boolean, Consts in Plate");
		this.color=color;
		this.broken=broken;
		this.plateType=plateType;
		this.shape=shape;
		this.price=price;
		this.brand=brand;
		this.weight=weight;
		this.capacity=capacity;
	}
}