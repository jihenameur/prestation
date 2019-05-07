package com.gproconsulting.prestation.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.gproconsulting.prestation.repository.CustomerRepository;
import com.gproconsulting.prestation.domain.*;
@org.springframework.stereotype.Service

public class CustomerServiceImplementation implements CustomerServiceInterface{
	@Autowired
 private CustomerRepository customerRepository;
	@Override
	public Customer saveCustomer(Customer customer) {
		
		return customerRepository.save(customer);
	}

	@Override
	public Boolean deleteCustomer(Long customerId) {
		Customer customer = customerRepository.findOne(customerId);
		if(customer!=null){
			customerRepository.delete(customer);
			 return true;
		}
		return false;
	}

	@Override
	public Customer editCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer findCustomer(Long customerId) {
		// TODO Auto-generated method stub
		return customerRepository.findOne(customerId);
	}

	@Override
	public Collection<Customer> getAllCustomers() {
		Iterable<Customer> itr = customerRepository.findAll();
		return (Collection<Customer>)itr;
	}

}
