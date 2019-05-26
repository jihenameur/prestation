package com.gproconsulting.prestation.repository;

import org.springframework.data.repository.CrudRepository;

import com.gproconsulting.prestation.domain.Provider;

public interface ProviderRepository extends CrudRepository<Provider,Long > {
	public Provider findProviderByLoginAndPassword(String login,String password);

}
