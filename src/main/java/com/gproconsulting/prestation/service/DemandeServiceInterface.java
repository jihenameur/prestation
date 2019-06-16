package com.gproconsulting.prestation.service;

import java.util.Collection;
import java.util.List;

import com.gproconsulting.prestation.domain.Demande;
import com.gproconsulting.prestation.domain.Service;

public interface DemandeServiceInterface {
	public Demande saveDemande(Demande demande);
	public Boolean deleteDemande(Long demandeId);
	public Demande editDemande(Demande demande);
	public Demande findDemande(Long demandeId);
	public Collection<Demande> getAllDemandes();
	public List<Demande> findByUSer(Long id);
	public List<Demande> findByService(Long id);
	
}
