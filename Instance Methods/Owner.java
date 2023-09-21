class Owner{
	String name;
	int age;
	double height;
	int investment;
	String gender;
	Owner(String name,int age,double height,int investment,String gender)
	{
		System.out.println("Owner");
		this.name=name;
		this.age=age;
		this.height=height;
		this.investment=investment;
		this.gender=gender;
		
	}
	void detailsOfOwner()
	{
		System.out.println("Owner's name is : "+name);
		System.out.println("Owner's age is : "+age);
		System.out.println("Owner's height is : "+height);
		System.out.println("Owner's investment is : "+investment);
		System.out.println("Owner's gender is : "+gender);
	}
}
	