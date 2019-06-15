package com.gproconsulting.prestation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.gproconsulting.prestation.domain.Service;



public interface ServiceRepository extends CrudRepository<Service, Long>{

	public <List>Service findServiceByTitle(String serviceLibelle) ;
	
	
	@Query("select s from Service s where s.user.id = :userId")
	public List<Service> findByUser(@Param("userId") Long userId) ;


	
	
	
	}

