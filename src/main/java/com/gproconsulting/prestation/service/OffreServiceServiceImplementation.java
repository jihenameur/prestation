package com.gproconsulting.prestation.service;

import java.util.Collection;

import com.gproconsulting.prestation.domain.OffreService;
import com.gproconsulting.prestation.repository.OffreServiceRepository;

public class OffreServiceServiceImplementation implements OffreServiceServiceInterface {
 protected OffreServiceRepository OffreServiceRepository;
	@Override
	public OffreService saveOffreService(OffreService offreservice) {
		// TODO Auto-generated method stub hedha commentaire tnajmi tna7ih
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
		// TODO Auto-generated method stub
		Iterable<OffreService> itr = OffreServiceRepository.findAll();
		return (Collection<OffreService>)itr;
	}
	

}
