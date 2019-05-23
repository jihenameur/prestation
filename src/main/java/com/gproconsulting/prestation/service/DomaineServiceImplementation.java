package com.gproconsulting.prestation.service;

import java.util.Collection;

import com.gproconsulting.prestation.domain.Domaine;
import com.gproconsulting.prestation.repository.DomaineRepository;

@org.springframework.stereotype.Service
public class DomaineServiceImplementation implements DomaineServiceInterface {
	 private DomaineRepository domaineRepository;
	@Override
	public Collection<Domaine> getAllDomaine() {
		Iterable<Domaine>itr=domaineRepository.findAll();
		return (Collection<Domaine>) itr;
	}

	@Override
	public Domaine findDomaine(long Domaineid) {
		// TODO Auto-generated method stub
		return domaineRepository.findOne(Domaineid);
	}

	@Override
	public Boolean deleteDomaine(long DomaineId) {
		Domaine domaine = domaineRepository.findOne(DomaineId);
		if(domaine!=null){
			domaineRepository.delete(domaine);
			 return true;
		}
		return false;
	}

	@Override
	public Domaine saveDomaine(Domaine domaine) {
		// TODO Auto-generated method stub
		return domaineRepository.save(domaine);
	}

	@Override
	public Domaine editDomaine(Domaine domaine) {
		// TODO Auto-generated method stub
		return domaineRepository.save(domaine);
	}

}
