package com.gproconsulting.prestation.service;

import java.util.Collection;

import com.gproconsulting.prestation.domain.Demande;

public interface DemandeServiceInterface {
	public Demande saveDemande(Demande demande);
	public Boolean deleteDemande(Long demandeId);
	public Demande editDemande(Demande demande);
	public Demande findDemande(Long demandeId);
	public Collection<Demande> getAllDemandes();
	
}
