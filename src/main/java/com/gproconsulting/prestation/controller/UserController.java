package com.gproconsulting.prestation.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gproconsulting.prestation.domain.User;
import com.gproconsulting.prestation.service.UserServiceInterface;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
@Autowired
private UserServiceInterface userInterface;


@GetMapping("allUsers")
public Collection<User>retrouverAllUser(){
	return userInterface.getAllUsers();
}


@GetMapping("/UserById:{id}")
public User retrouveUser(@PathVariable long id) {
	return  userInterface.findUser(id);

	
}

@DeleteMapping("/deleteUser:{id}")
public void deleteUser(@PathVariable long id) {
	userInterface.deleteUser(id);
}
@PostMapping("/saveUser")
public User createUser(@RequestBody User User) {
	return  userInterface.saveUser(User) ;
}
@PutMapping("/updateUser")
public User updateUser(@RequestBody User User) {
	return userInterface.editUser(User);
}
@PostMapping("/UserByLoginAndPassword")
public User retrouverUser(@RequestBody User user) {
	return userInterface.findUserByLoginAndPassword(user.getLogin(), user.getPassword());
}
}
