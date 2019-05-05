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

import com.gproconsulting.prestation.domain.Reclamation;
import com.gproconsulting.prestation.domain.Service;
import com.gproconsulting.prestation.service.ReclamationServiceInterface;

@RestController("reclamation")
public class ReclamationController {
	
	@Autowired
	private ReclamationServiceInterface reclamationInterface;
	@GetMapping("/reclamations")
	public Collection<Reclamation> retrouveAllReclamation(){
		return reclamationInterface.getAllReclamations();
	}
}
