package com.gproconsulting.prestation.controller;

import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gproconsulting.prestation.domain.User;
import com.gproconsulting.prestation.repository.UserRepository;
import com.gproconsulting.prestation.service.UserServiceInterface;


@RestController
public class UserController {

	@Autowired
	private UserServiceInterface userServiceInterface;
	
	@GetMapping("/users")
	public Collection<User> retrieveAllUsers() {
		return userServiceInterface.getAllUsers();
	}

	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable long id) {
		return  userServiceInterface.findUser(id);

		
	}

	@DeleteMapping("/delete/{id}")
	public void deleteUser(@PathVariable long id) {
		userServiceInterface.deleteUser(id);
	}

	@PostMapping("/save")
	public User createUser(@RequestBody User user) {
		return  userServiceInterface.saveUser(user) ;

	
	}
	
	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		return userServiceInterface.editUser(user);
	}
	
	
}
