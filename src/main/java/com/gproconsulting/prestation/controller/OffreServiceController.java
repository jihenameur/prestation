package com.gproconsulting.prestation.controller;

import java.util.ArrayList;

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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gproconsulting.prestation.domain.OffreService;

import com.gproconsulting.prestation.service.OffreServiceServiceInterface;


@Controller
@ComponentScan
public class OffreServiceController {
	@Autowired
	OffreServiceServiceInterface OffreServiceServiceInterface;
	
	@GetMapping("/")
	public String savePage(Model model) {
		model.addAttribute("offreservice", new OffreService());
		model.addAttribute("allOffreServices", (ArrayList<OffreService>)OffreServiceServiceInterface.getAllOffreServices());
		return "index";
	}
	
	@PostMapping("/offreservive/save")
	public String saveUser(@ModelAttribute("offreservice") OffreService offreservice,
			final RedirectAttributes redirectAttributes) {
		
		if(OffreServiceServiceInterface.saveOffreService(offreservice)!=null) {
			redirectAttributes.addFlashAttribute("saveOffreService", "success");
		} else {
			redirectAttributes.addFlashAttribute("saveOffreService", "unsuccess");
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/offreservice/{operation}/{offreserviceId}", method = RequestMethod.GET)
	public String editRemoveOffreService(@PathVariable("operation") String operation,
			@PathVariable("saveoffreserviceId") Long offreserviceId, final RedirectAttributes redirectAttributes,
			Model model) {
		if(operation.equals("delete")) {
			if(OffreServiceServiceInterface.deleteOffreService(offreserviceId)) {
				redirectAttributes.addFlashAttribute("deletion", "success");
			} else {
				redirectAttributes.addFlashAttribute("deletion", "unsuccess");
			}
		} else if(operation.equals("edit")){
		  OffreService editOffreService = OffreServiceServiceInterface.findOffreService(offreserviceId);
		  if(editOffreService!=null) {
		       model.addAttribute("editOffreService", editOffreService);
		       return "editPage";
		  } else {
			  redirectAttributes.addFlashAttribute("status","notfound");
		  }
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/offreservice/update", method = RequestMethod.POST)
	public String updateOffreService(@ModelAttribute("editOffreSevice") OffreService editOffreService,
			final RedirectAttributes redirectAttributes) {
		if(OffreServiceServiceInterface.editOffreService(editOffreService)!=null) {
			redirectAttributes.addFlashAttribute("edit", "success");
		} else {
			redirectAttributes.addFlashAttribute("edit", "unsuccess");
		}
		return "redirect:/";
	}
}
