package com.brillio.loginsignuptest.favcontent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class FavcontentController {
	
	@Autowired
	FavcontentRepository favconRepo;
	
	@PostMapping("/favourites")
	public Favcontent addFavourite(@RequestBody Favcontent content) {
		return favconRepo.save(content);
	}
	@GetMapping("/favourites")
	public List<Favcontent> getFavourites() {
		return favconRepo.findAll();
	}
	
	@DeleteMapping("/favourites/{id}")
	public Favcontent delFavourite(@PathVariable int id) {
		Favcontent content = favconRepo.findById(id);
		favconRepo.delete(content);
//		favconRepo.save(null);
		return content;
	}
}
