package com.gproconsulting.prestation.repository;

import org.springframework.data.repository.CrudRepository;

import com.gproconsulting.prestation.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer,Long > {
 public Customer findByLoginAndPassword(String login,String password);
}
