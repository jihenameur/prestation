package com.gproconsulting.prestation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.gproconsulting.prestation.domain.Demande;

public interface DemandeRepository extends CrudRepository<Demande, Long>{
	@Query("select d from Demande d where d.user.id = :userId")
	public List<Demande> findByUser(@Param("userId") Long userId) ;
	
	
	@Query("select d from Demande d where d.service.user.id = :userId")
	public List<Demande> findByService(@Param("userId") Long userId) ;

}

