package com.xworkz.laptop.mouse.runner;

import com.xworkz.laptop.mouse.dto.MovieDTO;
import com.xworkz.laptop.mouse.service.MovieService;
import com.xworkz.laptop.mouse.service.MovieServiceImpl;

public class MovieRunner {

	public static void main(String[] args) {
		MovieDTO movieDTO = new MovieDTO("Oppenheimer", "Christopher Nolan", 726562653, "Cilian Murphy");
		MovieService movieService = new MovieServiceImpl();
		boolean stored = movieService.validateAndSave(movieDTO);
		if (stored) {
			System.out.println("Data is stored");
		} else {
			System.err.println("Data isn't stored");
		}

	}

}
