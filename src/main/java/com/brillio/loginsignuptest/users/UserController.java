package com.brillio.loginsignuptest.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {

	@Autowired
	UsersRepo repo;

	@RequestMapping("/")
	public String MyUser() {
		System.out.println("controller working");
		return "Myuser";
	}

	@GetMapping("/users/{id}")
	public List<Users> getUsers(@PathVariable(required = false) int id) {
		if (id != 0) {
			return (List<Users>) repo.findAll();
		}
		else return new List<Users>;
	}

	@PostMapping("/users")
	public Users createUsers(@RequestBody Users user) {
		return repo.save(user);
	}

	@PutMapping("/users/{id}")
	public Users putUsers(@PathVariable int id) {
		Users user = repo.getById(id);
		if (user.getCategory().equals("freemium")) {
			user.setCategory("premium");
		} else {
			user.setCategory("freemium");
			System.out.println(user.getCategory());
		}
		return repo.save(user);
	}

}
