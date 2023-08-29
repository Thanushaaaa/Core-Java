package com.xworkz.laptop.mouse.service;

import com.xworkz.laptop.mouse.dto.MovieDTO;

public interface MovieService {
	boolean validateAndSave(MovieDTO movieDTO);

	MovieDTO findByName(String movieName);

	MovieDTO findByNameAndDirectorName(String movieName, String directorName);

}
