package com.gproconsulting.prestation.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.gproconsulting.prestation.domain.Provider;
import com.gproconsulting.prestation.repository.ProviderRepository;
@org.springframework.stereotype.Service


public class ProviderServiceImplementation implements ProviderServiceInterface {
@Autowired
private ProviderRepository providerRepository;
	@Override
	public Provider saveProvider(Provider provider) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteProvider(Long providerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Provider editProvider(Provider provider) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Provider findProvider(Long providerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Provider> getAllProviders() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	

}
