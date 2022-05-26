package com.elhewazy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elhewazy.beans.Users;
import com.elhewazy.service.UserService;

@RestController
public class UsersController {

	@Autowired
	UserService us;

	@GetMapping("getUser/{id}")
	public Users getUser(@PathVariable("id") String id) {

		return us.getUser(Integer.parseInt(id));
	}

	@PostMapping(value = "/addUser", consumes = "application/json", produces = "application/json")
	public Users addUser(@RequestBody Users user) {

		return us.addUser(user);
	}

	@DeleteMapping(value = "deletUser/{id}")
	public String deletUser(@PathVariable("id") int id) {

		return us.deletUser(id);
	}

	@PutMapping(value = "/updateUser/{id}", consumes = "application/json", produces = "application/json")
	public Users updateUser(@PathVariable("id") int id, @RequestBody Users change) {
		change.setId(id);

		return us.updateUser(change);
	}

}
