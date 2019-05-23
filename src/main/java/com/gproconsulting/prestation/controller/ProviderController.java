package com.gproconsulting.prestation.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@DeleteMapping("/deleteProvider:{id}")
	public void deleteProvider(@PathVariable long id) {
		providerInterface.deleteProvider(id);
	}
	
	@PostMapping("/saveProvider")
	public Provider createProvider(@RequestBody Provider provider) {
		return  providerInterface.saveProvider(provider) ;

	
	}
	
	
	@PutMapping("/updateProvider")
	public Provider updateProvider(@RequestBody Provider provider) {
		return providerInterface.editProvider(provider);
	}
	
}
