class Worker{
	String name;
	int age;
	String gender;
	int salary;
	boolean regularToWork;
	Worker(String name,int age,String gender,int salary,boolean regularToWork)
	{
		System.out.println("Details of workers");
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.salary=salary;
		this.regularToWork=regularToWork;
	}
	void getDetails()
	{
		System.out.println("Worker's name is : "+name);
		System.out.println("Worker's age is : "+age);
		System.out.println("Worker's gender is : "+gender);
		System.out.println("Worker's salary is : "+salary);
		System.out.println("Is he/she regular to work : "+regularToWork);
	}
}