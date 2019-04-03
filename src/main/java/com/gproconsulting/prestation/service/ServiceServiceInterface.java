package com.gproconsulting.prestation.service;

import java.util.Collection;

import com.gproconsulting.prestation.domain.Service;
import com.gproconsulting.prestation.domain.User;

public interface ServiceServiceInterface {
	public Service saveService(Service service);
	public Boolean deleteService(Long serviceId);
	public Service editService(Service service);
	public User findService(Long serviceId);
	public Collection<Service> getAllService();

}
