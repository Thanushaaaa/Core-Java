package com.xworkz.laptop.mouse.service;

import com.xworkz.laptop.mouse.dto.MovieDTO;
import com.xworkz.laptop.mouse.util.ValidationUtil;
import com.xworkz.laptop.mouse.repository.*;

public class MovieServiceImpl implements MovieService {

	@Override
	public boolean validateAndSave(MovieDTO movieDTO) {
		if (movieDTO != null) {
			System.out.println("Invoking valid and save in movie service implementation");
			String name = movieDTO.getMovieName();
			String director = movieDTO.getDirectorName();
			String hero = movieDTO.getMaleLeadName();
			long budget = movieDTO.getBudget();
			if (ValidationUtil.validateString(name)) {
				System.out.println("Valid movie name entered");
			} else {
				System.err.println("Invalid movie name entered");
				return false;
			}
			if (ValidationUtil.validateString(director)) {
				System.out.println("Valid director name entered");
			} else {
				System.err.println("Invalid director name entered");
				return false;
			}
			if (ValidationUtil.validateString(hero)) {
				System.out.println("Valid hero name entered");
			} else {
				System.err.println("Invalid hero name entered");
				return false;
			}
			if (budget > 0 && budget < 800000000) {
				System.out.println("Valid budget entered");
			} else {
				System.err.println("Invalid budget entered");
				return false;
			}
			System.out.println(":) :) :)");
			MovieRepository movieRepository = new MovieRepositoryImpl();
			movieRepository.save(movieDTO);
			return true;

		} else {
			System.err.println("Please enter valid data");
		}
		return false;

	}

}
