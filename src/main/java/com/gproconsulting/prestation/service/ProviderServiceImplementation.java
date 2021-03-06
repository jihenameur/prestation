package com.gproconsulting.prestation.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.gproconsulting.prestation.domain.Provider;
import com.gproconsulting.prestation.domain.Service;
import com.gproconsulting.prestation.repository.ProviderRepository;
@org.springframework.stereotype.Service


public class ProviderServiceImplementation implements ProviderServiceInterface {
@Autowired
private ProviderRepository providerRepository;
	@Override
	public Provider saveProvider(Provider provider) {
		// TODO Auto-generated method stub
		return providerRepository.save(provider);
	}

	@Override
	public Boolean deleteProvider(Long providerId) {
		// TODO Auto-generated method stub
		Provider Provider=providerRepository.findOne(providerId);
		if(Provider!=null) {
			providerRepository.delete(providerId);
			return true;
		}
		return false;
	}

	@Override
	public Provider editProvider(Provider provider) {
		// TODO Auto-generated method stub
		return providerRepository.save(provider);
	}

	@Override
	public Provider findProvider(Long providerId) {
		// TODO Auto-generated method stub
		return providerRepository.findOne(providerId);
	}

	@Override
	public Collection<Provider> getAllProviders() {
		Iterable<Provider> itr = providerRepository.findAll();
		return (Collection<Provider>)itr;
	}

	@Override
	public Provider findProviderByLoginAndPassword(String login, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	

}
