package com.gproconsulting.prestation.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.gproconsulting.prestation.repository.ReclamationRepository;
import com.gproconsulting.prestation.domain.Reclamation;

@org.springframework.stereotype.Service
public class ReclamationServiceImplementation implements ReclamationServiceInterface {
	@Autowired
 private  ReclamationRepository reclamationRepository ;
	

	@Override
	public Reclamation saveReclamation(Reclamation reclamation) {
		// TODO Auto-generated method stub
		return  reclamationRepository.save(reclamation);
	}

	@Override
	public Boolean deleteReclamation(Long reclamationId) {
		// TODO Auto-generated method stub
		Reclamation recl = reclamationRepository.findOne(reclamationId);
		if(recl!=null){
			reclamationRepository.delete(recl);
			 return true;
		}
		return false;
	}

	@Override
	public Reclamation editReclamation(Reclamation reclamation) {
		// TODO Auto-generated method stub
		return reclamationRepository.save(reclamation);
	}

	@Override
	public Reclamation findReclamation(Long reclamationId) {
		// TODO Auto-generated method stub
		return reclamationRepository.findOne(reclamationId);
	}

	@Override
	public Collection<Reclamation> getAllReclamations() {
		// TODO Auto-generated method stub
		Iterable<Reclamation> itr = reclamationRepository.findAll();
		return (Collection<Reclamation>)itr;
	}

}
