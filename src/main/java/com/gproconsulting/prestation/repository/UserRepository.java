package com.gproconsulting.prestation.repository;

import org.springframework.data.repository.CrudRepository;

import com.gproconsulting.prestation.domain.User;


public interface UserRepository extends CrudRepository<User, Long>{

   public User findByLoginAndPassword(String login, String password);


	}
