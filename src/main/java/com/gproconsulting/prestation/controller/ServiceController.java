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

import com.gproconsulting.prestation.domain.Service;
import com.gproconsulting.prestation.domain.User;
import com.gproconsulting.prestation.service.ServiceServiceInterface;


@Controller
@ComponentScan
public class ServiceController {
	@Autowired
	ServiceServiceInterface ServiceServiceInterface ;
	
	@GetMapping("/")
	public String savePage(Model model) {
		model.addAttribute("Service", new Service());
		model.addAttribute("allServices", (ArrayList<Service>)ServiceServiceInterface .getAllService());
		return "index";
	}
	
	@PostMapping("/service/save")
	public String saveService(@ModelAttribute("user") Service service,
			final RedirectAttributes redirectAttributes) {
		
		if(ServiceServiceInterface .saveService(service)!=null) {
			redirectAttributes.addFlashAttribute("saveService", "success");
		} else {
			redirectAttributes.addFlashAttribute("saveService", "unsuccess");
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/service/{operation}/{serviceId}", method = RequestMethod.GET)
	public String editRemoveService(@PathVariable("operation") String operation,
			@PathVariable("serviceId") Long serviceId, final RedirectAttributes redirectAttributes,
			Model model) {
		if(operation.equals("delete")) {
			if(ServiceServiceInterface .deleteService(serviceId)) {
				redirectAttributes.addFlashAttribute("deletion", "success");
			} else {
				redirectAttributes.addFlashAttribute("deletion", "unsuccess");
			}
		} else if(operation.equals("edit")){
		  User editService = ServiceServiceInterface .findService(serviceId);
		  if(editService!=null) {
		       model.addAttribute("editService", editService);
		       return "editPage";
		  } else {
			  redirectAttributes.addFlashAttribute("status","notfound");
		  }
		}
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/service/update", method = RequestMethod.POST)
	public String updateService(@ModelAttribute("editService")Service editService,
			final RedirectAttributes redirectAttributes) {
		if(ServiceServiceInterface .editService(editService)!=null) {
			redirectAttributes.addFlashAttribute("edit", "success");
		} else {
			redirectAttributes.addFlashAttribute("edit", "unsuccess");
		}
		return "redirect:/";
	}
}
