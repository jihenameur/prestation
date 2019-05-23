package com.gproconsulting.prestation.service;

import java.util.Collection;

import com.gproconsulting.prestation.domain.Domaine;

public interface DomaineServiceInterface {

	public Collection<Domaine> getAllDomaine();

public	Domaine findDomaine(long id);

	public Boolean deleteDomaine(long id);

	public Domaine saveDomaine(Domaine domaine);

	
	public Domaine editDomaine(Domaine domaine);

}
