package com.xworkz.India;

public class PoliticianRunner {

	public static void main(String[] args) {
		PoliticianRepository politicianRepository=new PoliticianRepositoryImpl();
		politicianRepository.save("Jagan");
		politicianRepository.save("PK");
		politicianRepository.save("NBK");
		politicianRepository.save("NTR");
		politicianRepository.save("Rajendra");
		politicianRepository.display();

	}

}
