package com.gproconsulting.prestation.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gproconsulting.prestation.domain.Demande;
import com.gproconsulting.prestation.service.DemandeServiceInterface;

public class DemandeController {
	@Autowired
DemandeServiceInterface DemandeServiceInterface;
	
	@GetMapping("/")
	public String savePage(Model model) {
		model.addAttribute("user", new Demande());
		model.addAttribute("allUsers", (ArrayList<Demande>)DemandeServiceInterface.getAllDemandes());
		return "index";
	}
	
	@PostMapping("/user/save")
	public String saveUser(@ModelAttribute("user") Demande demande,
			final RedirectAttributes redirectAttributes) {
		
		if(DemandeServiceInterface.saveDemande(demande)!=null) {
			redirectAttributes.addFlashAttribute("saveUser", "success");
		} else {
			redirectAttributes.addFlashAttribute("saveUser", "unsuccess");
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/demande/{operation}/{userId}", method = RequestMethod.GET)
	public String editRemoveDemande(@PathVariable("operation") String operation,
			@PathVariable("demandeId") Long demandeId, final RedirectAttributes redirectAttributes,
			Model model) {
		if(operation.equals("delete")) {
			if(DemandeServiceInterface.deleteDemande(demandeId)) {
				redirectAttributes.addFlashAttribute("deletion", "success");
			} else {
				redirectAttributes.addFlashAttribute("deletion", "unsuccess");
			}
		} else if(operation.equals("edit")){
		Demande editDemande = DemandeServiceInterface.findDemande(demandeId);
		  if(editDemande!=null) {
		       model.addAttribute("editDemande", editDemande);
		       return "editPage";
		  } else {
			  redirectAttributes.addFlashAttribute("status","notfound");
		  }
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/Demande/update", method = RequestMethod.POST)
	public String updateEmployee(@ModelAttribute("editUser") Demande editUser,
			final RedirectAttributes redirectAttributes) {
		if(DemandeServiceInterface.editDemande(editUser)!=null) {
			redirectAttributes.addFlashAttribute("edit", "success");
		} else {
			redirectAttributes.addFlashAttribute("edit", "unsuccess");
		}
		return "redirect:/";
	}

}
