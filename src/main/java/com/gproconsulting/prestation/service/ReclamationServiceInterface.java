package com.gproconsulting.prestation.service;

import java.util.Collection;

import com.gproconsulting.prestation.domain.Reclamation;


public interface ReclamationServiceInterface {
	public Reclamation saveReclamation(Reclamation reclamation);
	public Boolean deleteReclamation(Long reclamationId);
	public Reclamation editReclamation(Reclamation reclamation);
	public Reclamation findReclamation(Long reclamationId);
	public Collection<Reclamation> getAllReclamations();

}
