package com.xworkz.football;

public class OlympicRunner {

	public static void main(String[] args) {
		OlympicRepository olympicRepository=new OlympicRepositoryImpl();
		olympicRepository.save(1991);
		olympicRepository.save(1992);
		olympicRepository.save(1993);
		olympicRepository.save(1994);
		olympicRepository.save(1995);
		olympicRepository.display();

	}

}
