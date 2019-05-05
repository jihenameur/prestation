package com.gproconsulting.prestation.repository;

import javax.persistence.QueryHint;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.gproconsulting.prestation.domain.User;


public interface UserRepository extends CrudRepository<User, Long>{

   // public User findUserByLoginAndPassword(String login, String password);


	}
