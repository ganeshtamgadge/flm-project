package com.flm.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flm.rest.dto.UserDto;
import com.flm.rest.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userservice;

	@PostMapping("/create-user")
	public String createUser(@RequestBody UserDto userdto) {
		userservice.createUser(userdto);
		return "user created";

	}

	@PutMapping("/update-user")
	public String updateUser(@RequestBody UserDto userdto) {
		userservice.updateUser(userdto);
		return "user updated";

	}
}