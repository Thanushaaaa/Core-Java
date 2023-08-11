package com.xworkz.land;

public class ApartmentRunner {

	public static void main(String[] args) {
		ApartmentRepository apartmentRepository=new ApartmentRepositoryImpl();
		apartmentRepository.save("Anand");
		apartmentRepository.save("Vidya");
		apartmentRepository.save("Ankitha");
		apartmentRepository.save("Navitha");
		apartmentRepository.save("Akshara");
		apartmentRepository.display();

	}

}
