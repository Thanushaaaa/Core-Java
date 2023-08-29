package com.xworkz.laptop.mouse.repository;

import com.xworkz.laptop.mouse.dto.MovieDTO;

public class MovieRepositoryImpl implements MovieRepository {
	private MovieDTO[] movieDTO1 = new MovieDTO[NO_OF_MOVIES];
	private int start = 0;

	@Override
	public void save(MovieDTO movieDTO) {
		if (movieDTO != null) {
			System.out.println("Invoking save in movie repository implementation");
			this.movieDTO1[start] = movieDTO;
			this.start++;
		} else {
			System.err.println("Can't store,array is full");
		}

	}

	@Override
	public MovieDTO findByName(String movieName) {
		for (int count = 0; count < start; count++) {
			if (movieDTO1[count].getMovieName().equals(movieName)) {
				System.out.println("Movie found");
				return movieDTO1[count];

			}
			System.out.println("Moving to next index");
		}
		System.err.println("Movie not found");
		return null;
	}

	@Override
	public MovieDTO findByNameAndDirectorName(String movieName, String directorName) {
		for (int count = 0; count < start; count++) {
			if (movieDTO1[count].getMovieName().equals(movieName)
					&& movieDTO1[count].getDirectorName().equals(directorName)) {
				System.out.println("Movie found");
				return movieDTO1[count];

			}
			System.out.println("Moving to next index");
		}
		System.err.println("Movie not found");
		return null;
	}

}
