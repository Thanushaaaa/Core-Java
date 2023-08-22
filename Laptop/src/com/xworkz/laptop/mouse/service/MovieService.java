package com.xworkz.laptop.mouse.service;

import com.xworkz.laptop.mouse.dto.MovieDTO;

public interface MovieService {
	boolean validateAndSave(MovieDTO movieDTO);

}
