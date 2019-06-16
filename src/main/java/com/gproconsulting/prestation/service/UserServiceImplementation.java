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
		try {
			return userRepository.findOne(UserId);

		} catch (Exception e) {
			return new User() ;
		}
	}

	@Override
	public Collection<User> getAllUsers() {
		try {
			Iterable<User> itr = userRepository.findAll();
			return (Collection<User>)itr;
		} catch (Exception e) {
			e.printStackTrace();
			return null ;
		}
		
	}

	@Override
	public User findUserByLoginAndPassword(String login,String password) {
		try {
			return userRepository.findByLoginAndPassword(login, password);
		} catch (Exception e) {
			e.printStackTrace();
			return new User() ;
		}
		
	}

}
