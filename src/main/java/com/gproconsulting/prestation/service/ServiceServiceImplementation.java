package com.gproconsulting.prestation.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.gproconsulting.prestation.domain.OffreService;
import com.gproconsulting.prestation.domain.Service;
import com.gproconsulting.prestation.domain.User;
import com.gproconsulting.prestation.repository.ServiceRepository;

@org.springframework.stereotype.Service
public class ServiceServiceImplementation implements ServiceServiceInterface {
	@Autowired
    private ServiceRepository serviceRepository;
	@Override
	public Service saveService(Service service) {
		// TODO Auto-generated method stub
		return serviceRepository.save(service);
	}

	@Override
	public Boolean deleteService(Long serviceId) {
		// TODO Auto-generated method stub
		Service service=serviceRepository.findOne(serviceId);
		if(service!=null) {
			serviceRepository.delete(serviceId);
			return true;
		}
		return false;
	}

	@Override
	public Service editService(Service service) {
		// TODO Auto-generated method stub
		return serviceRepository.save(service);
	}

	@Override
	public Service findService(Long serviceId) {
		// TODO Auto-generated method stub
		return serviceRepository.findOne(serviceId);
	}

	@Override
	public Collection<Service> getAllService() {
		// TODO Auto-generated method stub
		Iterable<Service> itr = serviceRepository.findAll();
		return (Collection<Service>)itr;
	}

	@Override
	public Service findServiceByLibelle(String libelle) {
		// TODO Auto-generated method stub
		//Service service= ServiceRepository.findServiceByLibelle(libelle);
		return null;
	}
   

}
