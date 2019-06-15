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

import com.gproconsulting.prestation.domain.Demande;
import com.gproconsulting.prestation.service.DemandeServiceInterface;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DemandeController {
	@Autowired
	private DemandeServiceInterface demandeInterface;
	@GetMapping("/demandes")
	public Collection<Demande> retrouveAllDemande(){
		return demandeInterface.getAllDemandes();
	}
	@GetMapping("/demandeById:{id}")
	public Demande retrouveDemande(@PathVariable long id) {
		return  demandeInterface.findDemande(id);

		
	}
	@DeleteMapping("/deleteDemande:{id}")
	public void deleteDemande(@PathVariable long id) {
		demandeInterface.deleteDemande(id);
	}
	@PostMapping("/saveDemande")
	public Demande createDemande(@RequestBody Demande demande) {
		return  demandeInterface.saveDemande(demande) ;

	
	}
	@PutMapping("/updateDemande")
	public Demande updateDemande(@RequestBody Demande demande) {
		return demandeInterface.editDemande(demande);
	}
	
}
