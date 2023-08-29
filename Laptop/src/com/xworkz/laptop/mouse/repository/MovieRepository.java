package com.xworkz.laptop.mouse.repository;

import com.xworkz.laptop.mouse.dto.MovieDTO;

public interface MovieRepository {

	int NO_OF_MOVIES = 5;

	void save(MovieDTO movieDTO);

	MovieDTO findByName(String movieName);

	MovieDTO findByNameAndDirectorName(String movieName, String directorName);

}
