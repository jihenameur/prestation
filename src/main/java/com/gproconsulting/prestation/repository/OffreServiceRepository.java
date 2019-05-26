package com.gproconsulting.prestation.repository;

import org.springframework.data.repository.CrudRepository;

import com.gproconsulting.prestation.domain.OffreService;


public interface OffreServiceRepository extends CrudRepository<OffreService, Long>{
	public <List>OffreService FindOffreServiceByLibelle(String OffreServicelibelle);
}

