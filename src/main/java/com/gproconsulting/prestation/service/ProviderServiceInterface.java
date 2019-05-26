package com.gproconsulting.prestation.service;

import java.util.Collection;

import com.gproconsulting.prestation.domain.OffreService;
import com.gproconsulting.prestation.domain.Provider;

public interface ProviderServiceInterface {
	public Provider saveProvider(Provider provider);
	public Boolean deleteProvider(Long providerId);
	public Provider editProvider(Provider provider);
	public Provider findProvider(Long providerId);
	public Collection<Provider> getAllProviders();
   public Provider findProviderByLoginAndPassword(String login ,String password);
}
