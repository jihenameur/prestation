package com.gproconsulting.prestation.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gproconsulting.prestation.domain.Demande;
import com.gproconsulting.prestation.repository.DemandeRepository;
@org.springframework.stereotype.Service
public class DemandeServiceImplementation implements DemandeServiceInterface {
	
	@Autowired
private DemandeRepository demandeRepository;
	@Override
	public Demande saveDemande(Demande demande) {
		// TODO Auto-generated method stub
		return demandeRepository.save(demande);
	}

	@Override
	public Boolean deleteDemande(Long demandeId) {
		// TODO Auto-generated method stub
		Demande dem = demandeRepository.findOne(demandeId);
		if(dem!=null){
			 demandeRepository.delete(dem);
			 return true;
		}
		return false;
	}

	@Override
	public Demande editDemande(Demande demande) {
		// TODO Auto-generated method stub
		return demandeRepository.save(demande);
	}

	@Override
	public Demande findDemande(Long demandeId) {
		// TODO Auto-generated method stub
		return demandeRepository.findOne(demandeId);
	}

	@Override
	public Collection<Demande> getAllDemandes() {
		// TODO Auto-generated method stub
		Iterable<Demande> itr = demandeRepository.findAll();
		return (Collection<Demande>)itr;
	}

	@Override
	public List<Demande> findByUSer(Long id) {
		return demandeRepository.findByUser(id);
	}

	@Override
	public List<Demande> findByService(Long id) {
		return demandeRepository.findByService(id);
	}

}
