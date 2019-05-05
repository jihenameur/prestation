package com.gproconsulting.prestation.repository;

import org.springframework.data.repository.CrudRepository;

import com.gproconsulting.prestation.domain.OffreService;
import com.gproconsulting.prestation.domain.Service;



public interface ServiceRepository extends CrudRepository<Service, Long>{

	//public <List>Service findServiceByLibelle(String serviceLibelle) ;


	}

