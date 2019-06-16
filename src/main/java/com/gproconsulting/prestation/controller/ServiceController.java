package com.gproconsulting.prestation.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gproconsulting.prestation.domain.Service;
import com.gproconsulting.prestation.service.ServiceServiceInterface;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ServiceController {
	

	@Autowired
	private ServiceServiceInterface serviceInterface;
	
	@GetMapping("/allservices")
	public Collection<Service> retrieveAllServices() {
		return serviceInterface.getAllService() ;
	}
     
	@GetMapping("/serviceById/{id}")
	public Service retrouveService(@PathVariable long id) {
		return  serviceInterface.findService(id);

		
	}
	
	
	@DeleteMapping("/deleteService:{id}")
	public void deleteService(@PathVariable long id) {
		serviceInterface.deleteService(id);
	}

	@PostMapping("/saveService")
	public Service createService(@RequestBody Service Service) {
		return  serviceInterface.saveService(Service) ;

	
	}
	
	@PutMapping("/updateService")
	public Service updateService(@RequestBody Service Service) {
		return serviceInterface.editService(Service);
	}
	
	@GetMapping("/serviceByTitle")
	public Service retrouverService(@RequestBody String libelle) {
		return serviceInterface.findServiceByLibelle(libelle);
		
	}
	
	
    
	@GetMapping("/serviceByUser/{id}")
	public List<Service> getByUSer(@PathVariable("id") Long id) {
		return  serviceInterface.findByUSer(id) ;

		
	}
	
}
