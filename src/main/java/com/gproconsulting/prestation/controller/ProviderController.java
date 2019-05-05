package com.gproconsulting.prestation.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gproconsulting.prestation.domain.Provider;
import com.gproconsulting.prestation.domain.User;
import com.gproconsulting.prestation.service.ProviderServiceInterface;

@RestController("provider")
public class ProviderController {
	@Autowired
	private ProviderServiceInterface providerInterface;
	@GetMapping("providers")
	public Collection<Provider> retrieveAllProviders(){
	return	providerInterface.getAllProviders();

		
	}
	
}
