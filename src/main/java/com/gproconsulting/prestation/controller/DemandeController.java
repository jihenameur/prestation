package com.gproconsulting.prestation.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gproconsulting.prestation.domain.Demande;
import com.gproconsulting.prestation.domain.Service;
import com.gproconsulting.prestation.service.DemandeServiceInterface;

@RestController("demande")
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
	
}
