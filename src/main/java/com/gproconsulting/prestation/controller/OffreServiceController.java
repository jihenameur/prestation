package com.gproconsulting.prestation.controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gproconsulting.prestation.domain.OffreService;

import com.gproconsulting.prestation.service.OffreServiceServiceInterface;


@RestController("offre")
public class OffreServiceController {
	@Autowired
	private OffreServiceServiceInterface offreInterface;
	@GetMapping("/offres") 
	public Collection<OffreService> retrieveAllOffreService(){
		return offreInterface.getAllOffreServices();
	
}

}
