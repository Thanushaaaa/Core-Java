class OwnerRunner{
	public static void main(String[] args)
	{
	   System.out.println("Running main");
	   Owner owner=new Owner("Arun",30,5.5,200000,"Male");
	   owner.detailsOfOwner();
	   System.out.println("Owner 2");
	   owner.name="Ranjith";
	   owner.age=25;
	   owner.height=6;
	   owner.investment=150000;
	   owner.gender="Male";
	   owner.detailsOfOwner();
	}
}
	   
	   