package com.gproconsulting.prestation.service;

import java.util.Collection;

import com.gproconsulting.prestation.domain.OffreService;



public interface OffreServiceServiceInterface {
	public OffreService saveOffreService(OffreService offreservice);
	public Boolean deleteOffreService(Long offreserviceId);
	public OffreService editOffreService(OffreService offreservice);
	public OffreService findOffreService(Long offreserviceId);
	public Collection<OffreService> getAllOffreServices();

}
