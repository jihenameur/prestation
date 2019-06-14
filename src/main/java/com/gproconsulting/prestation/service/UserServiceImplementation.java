package com.gproconsulting.prestation.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.gproconsulting.prestation.repository.UserRepository;
import com.gproconsulting.prestation.domain.*;
@org.springframework.stereotype.Service

public class UserServiceImplementation implements UserServiceInterface{
	@Autowired
 private UserRepository userRepository;
	@Override
	public User saveUser(User User) {
		
		return userRepository.save(User);
	}

	@Override
	public Boolean deleteUser(Long UserId) {
		User User = userRepository.findOne(UserId);
		if(User!=null){
			userRepository.delete(User);
			 return true;
		}
		return false;
	}

	@Override
	public User editUser(User User) {
		return userRepository.save(User);
	}

	@Override
	public User findUser(Long UserId) {
		// TODO Auto-generated method stub
		return userRepository.findOne(UserId);
	}

	@Override
	public Collection<User> getAllUsers() {
		Iterable<User> itr = userRepository.findAll();
		return (Collection<User>)itr;
	}

	@Override
	public User findUserByLoginAndPassword(String login,String password) {
		return userRepository.findByLoginAndPassword(login, password);
	}

}
