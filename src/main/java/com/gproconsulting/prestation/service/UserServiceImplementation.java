package com.gproconsulting.prestation.service;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gproconsulting.prestation.domain.User;
import com.gproconsulting.prestation.repository.UserRepository;

import groovyjarjarantlr.collections.List;


@Service
@Transactional
public  class UserServiceImplementation implements UserServiceInterface{

	@Autowired
	protected UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public Boolean deleteUser(Long userId) {
		// TODO Auto-generated method stub
		User temp = userRepository.findOne(userId);
		if(temp!=null){
			 userRepository.delete(temp);
			 return true;
		}
		return false;
	}

	@Override
	public User editUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public Collection<User> getAllUsers() {
		// TODO Auto-generated method stub
		Iterable<User> itr = userRepository.findAll();
		return (Collection<User>)itr;
	}

	@Override
	public User findUser(Long userId) {
		// TODO Auto-generated method stub
		return userRepository.findOne(userId);
	}

	@Override
	public User findByLoginAndPassword(String login, String password) {
		// TODO Auto-generated method stub
		return null ;//userRepository.findUserByLoginAndPassword(login, password);
	}

	

	
 

	  
	
	
}