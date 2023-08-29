package com.xworkz.laptop.mouse.service;

import com.xworkz.laptop.mouse.dto.MovieDTO;
import com.xworkz.laptop.mouse.util.ValidationUtil;
import com.xworkz.laptop.mouse.repository.*;

public class MovieServiceImpl implements MovieService {
	private MovieRepository movieRepository = new MovieRepositoryImpl();

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

	@Override
	public MovieDTO findByName(String movieName) {
		boolean foundName = ValidationUtil.validateString(movieName);
		if (foundName) {
			System.out.println("Valid name entered");
			MovieDTO foundValues1 = movieRepository.findByName(movieName);
			return foundValues1;

		}
		System.err.println("Invalid name entered");
		return null;
	}

	@Override
	public MovieDTO findByNameAndDirectorName(String movieName, String directorName) {
		boolean foundName = ValidationUtil.validateString(movieName);
		boolean fountDirector = ValidationUtil.validateString(directorName);
		if (foundName && fountDirector) {
			System.out.println("Valid data entered");
			MovieDTO foundValues2 = movieRepository.findByNameAndDirectorName(movieName, directorName);
			return foundValues2;

		}
		System.err.println("Invalid data entered");
		return null;
	}

}
