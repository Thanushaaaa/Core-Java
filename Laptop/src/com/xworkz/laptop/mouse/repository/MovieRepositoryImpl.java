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
			System.out.println("Can't store,array is full");
		}

	}

}
