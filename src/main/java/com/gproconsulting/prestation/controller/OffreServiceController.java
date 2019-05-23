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

import com.gproconsulting.prestation.domain.OffreService;
import com.gproconsulting.prestation.domain.Service;
import com.gproconsulting.prestation.service.OffreServiceServiceInterface;


@RestController
public class OffreServiceController {
	@Autowired
	private OffreServiceServiceInterface offreInterface;
	@GetMapping("/offres") 
	   public Collection<OffreService> retrieveAllOffreService(){
		return offreInterface.getAllOffreServices();
	
}
	@GetMapping("/offreById:{id}")
	public OffreService retrouveService(@PathVariable long id) {
		return  offreInterface.findOffreService(id);

		
	}
	
	
	@DeleteMapping("/deleteOffre:{id}")
	public void deleteOffre(@PathVariable long id) {
		offreInterface.deleteOffreService(id);
	}

	@PostMapping("/saveOffre")
	public OffreService createOffreService(@RequestBody OffreService offre) {
		return  offreInterface.saveOffreService(offre) ;

	
	}
	
	@PutMapping("/updateOffre")
	public OffreService updateOffreService(@RequestBody OffreService offre) {
		return offreInterface.editOffreService(offre);
	}
	
	
	

}
