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

import com.gproconsulting.prestation.domain.Reclamation;

import com.gproconsulting.prestation.service.ReclamationServiceInterface;

@Controller
@ComponentScan
public class ReclamationController {
	@Autowired
	ReclamationServiceInterface ReclamationServiceInterface;
	
	@GetMapping("/")
	public String savePage(Model model) {
		model.addAttribute("reclamation", new Reclamation(null, null));
		model.addAttribute("allReclamation", (ArrayList<Reclamation>)ReclamationServiceInterface.getAllReclamations());
		return "index";
	}
	
	@PostMapping("/reclamation/save")
	public String saveReclamation(@ModelAttribute("reclamation") Reclamation reclamation,
			final RedirectAttributes redirectAttributes) {
		
		if(ReclamationServiceInterface.saveReclamation(reclamation)!=null) {
			redirectAttributes.addFlashAttribute("saveUser", "success");
		} else {
			redirectAttributes.addFlashAttribute("saveUser", "unsuccess");
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/reclamation/{operation}/{reclamationId}", method = RequestMethod.GET)
	public String editRemoveReclamation(@PathVariable("operation") String operation,
			@PathVariable("reclamationId") Long reclamationId, final RedirectAttributes redirectAttributes,
			Model model) {
		if(operation.equals("delete")) {
			if(ReclamationServiceInterface.deleteReclamation(reclamationId)) {
				redirectAttributes.addFlashAttribute("deletion", "success");
			} else {
				redirectAttributes.addFlashAttribute("deletion", "unsuccess");
			}
		} else if(operation.equals("edit")){
		Reclamation editReclamation = ReclamationServiceInterface.findReclamation(reclamationId);
		  if(editReclamation!=null) {
		       model.addAttribute("editReclamation", editReclamation);
		       return "editPage";
		  } else {
			  redirectAttributes.addFlashAttribute("status","notfound");
		  }
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/reclamation/update", method = RequestMethod.POST)
	public String updateReclamation(@ModelAttribute("editReclamation") Reclamation editReclamation,
			final RedirectAttributes redirectAttributes) {
		if(ReclamationServiceInterface.editReclamation(editReclamation)!=null) {
			redirectAttributes.addFlashAttribute("edit", "success");
		} else {
			redirectAttributes.addFlashAttribute("edit", "unsuccess");
		}
		return "redirect:/";
	}
}
