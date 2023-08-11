package com.xworkz.injection;

public class HospitalRunner {

	public static void main(String[] args) {
		HospitalRepository hospitalRepository=new HospitalRepositoryImpl();
		hospitalRepository.save("Jayadeva");
		hospitalRepository.save("Apollo");
		hospitalRepository.save("Newlife");
		hospitalRepository.save("Fortis");
		hospitalRepository.save("Life care");
		hospitalRepository.display();
	}

}
