class FireExtinguisherRunner{
	public static void main(String[] args)
	{
		FireExtinguisher fireExtinguisher=new FireExtinguisher(10000,"red",3,"water","Spago");
		fireExtinguisher.aboutFireExtinguisher();
		System.out.println("Fire extingusher 2");
		fireExtinguisher.price=12000;
		fireExtinguisher.color="blue";
		fireExtinguisher.quantity=2;
		fireExtinguisher.type="fuel";
		fireExtinguisher.brand="Stop fire";
		fireExtinguisher.aboutFireExtinguisher();
		
	}
}