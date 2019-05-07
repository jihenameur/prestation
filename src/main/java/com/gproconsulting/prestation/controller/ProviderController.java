package com.gproconsulting.prestation.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gproconsulting.prestation.domain.Provider;
import com.gproconsulting.prestation.service.ProviderServiceInterface;

@RestController
public class ProviderController {
	@Autowired
	private ProviderServiceInterface providerInterface;
	@GetMapping("/Allproviders")
	public Collection<Provider> retrieveAllProviders(){
	return	providerInterface.getAllProviders();

		
	}
	
	@GetMapping("/providerById:{id}")
	public Provider retrouveProvider(@PathVariable long id) {
		return  providerInterface.findProvider(id);

		
	}
	
	
	
	
	
	
}
