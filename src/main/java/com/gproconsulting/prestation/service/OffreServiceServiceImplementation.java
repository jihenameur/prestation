package com.gproconsulting.prestation.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.gproconsulting.prestation.domain.OffreService;
import com.gproconsulting.prestation.repository.OffreServiceRepository;

@org.springframework.stereotype.Service

public class OffreServiceServiceImplementation implements OffreServiceServiceInterface {
	@Autowired
 private OffreServiceRepository OffreServiceRepository;
	@Override
	public OffreService saveOffreService(OffreService offreservice) {
		return OffreServiceRepository.save(offreservice);
	}

	@Override
	public Boolean deleteOffreService(Long offreserviceId) {
		// TODO Auto-generated method stub
		OffreService offre = OffreServiceRepository.findOne(offreserviceId);
		if(offre!=null){
			OffreServiceRepository.delete(offre);
			 return true;
		}
		return false;
	}

	@Override
	public OffreService editOffreService(OffreService offreservice) {
		// TODO Auto-generated method stub
		return  OffreServiceRepository.save(offreservice);
	}

	@Override
	public OffreService findOffreService(Long offreserviceId) {
		// TODO Auto-generated method stub
		return  OffreServiceRepository.findOne(offreserviceId);
	}

	@Override
	public Collection<OffreService> getAllOffreServices() {
		Iterable<OffreService> itr = OffreServiceRepository.findAll();
		return (Collection<OffreService>)itr;
	}
	

}
