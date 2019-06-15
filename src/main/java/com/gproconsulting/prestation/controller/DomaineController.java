package com.gproconsulting.prestation.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gproconsulting.prestation.domain.Domaine;
import com.gproconsulting.prestation.service.DomaineServiceInterface;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DomaineController {
	@Autowired
	private DomaineServiceInterface DomaineInterface;
	
		@GetMapping("/allDomaines")
	public Collection<Domaine> retrouveAllDomaines() {
		return DomaineInterface.getAllDomaine() ;
	}
     
	@GetMapping("/DomaineById:{id}")
	public Domaine retrouveDomaine(@PathVariable long id) {
		return  DomaineInterface.findDomaine(id);

		
	}
	
	
	@DeleteMapping("/deleteDomaine:{id}")
	public void deleteDomaine(@PathVariable long id) {
		DomaineInterface.deleteDomaine(id);
	}

	@PostMapping("/saveDomaine")
	public Domaine createDomaine(@RequestBody Domaine Domaine) {
		return  DomaineInterface.saveDomaine(Domaine) ;

	
	}
	
	@PutMapping("/updateDomaine")
	public Domaine updateDomaine(@RequestBody Domaine Domaine) {
		return DomaineInterface.editDomaine(Domaine);
	}
	
}
