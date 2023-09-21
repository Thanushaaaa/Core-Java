class WorkerRunner{
	public static void main(String[] args)
	{
		System.out.println("Running main");
		Worker worker=new Worker("Aditya",40,"Male",20000,false);
		worker.getDetails();
		System.out.println("Updating details");
		worker.name="Ananya";
		worker.age=30;
		worker.gender="female";
		worker.salary=25000;
		worker.regularToWork=true;
		worker.getDetails();
	}
}
		