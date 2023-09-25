package com.brillio.loginsignuptest.film;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class FilmController {
	
	@Autowired
	FilmRepository filmRepo;
	
	@GetMapping("/getEmp")
	public List<Film> getFilms(){
		return filmRepo.findAll();
	}
	
	
	
	
	
	

}
