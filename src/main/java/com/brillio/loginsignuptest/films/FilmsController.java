package com.brillio.loginsignuptest.films;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class FilmsController {
	
	@Autowired
	FilmsRepository filmRepo;
	
	@PostMapping("/films")
	public Films setFilm(@RequestBody Films film) {
		return filmRepo.save(film);
	}
	
	@GetMapping("/films")
	public List<Films> getFilms(){
		return filmRepo.findAll();
	}
	

}
