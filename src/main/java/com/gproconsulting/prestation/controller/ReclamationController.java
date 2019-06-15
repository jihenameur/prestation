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

import com.gproconsulting.prestation.domain.Reclamation;
import com.gproconsulting.prestation.service.ReclamationServiceInterface;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ReclamationController {
	
	@Autowired
	private ReclamationServiceInterface reclamationInterface;
	@GetMapping("/reclamations")
	public Collection<Reclamation> retrouveAllReclamation(){
		return reclamationInterface.getAllReclamations();
	}
	
	@GetMapping("/ReclamationById:{id}")
	public Reclamation retrouveReclamation(@PathVariable long id) {
		return  reclamationInterface.findReclamation(id);

		
	}
	@DeleteMapping("/deleteReclamation:{id}")
	public void deleteReclamation(@PathVariable long id) {
		reclamationInterface.deleteReclamation(id);
	}
	@PostMapping("/saveReclamation")
	public Reclamation createReclamation(@RequestBody Reclamation Reclamation) {
		return  reclamationInterface.saveReclamation(Reclamation) ;

	
	}
	@PutMapping("/updateReclamation")
	public Reclamation updateReclamation(@RequestBody Reclamation Reclamation) {
		return reclamationInterface.editReclamation(Reclamation);
	}
	
}
