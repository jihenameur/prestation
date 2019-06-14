package com.gproconsulting.prestation.service;

import java.util.Collection;

import com.gproconsulting.prestation.domain.Customer;

public interface CustomerServiceInterface {
	public Customer saveCustomer(Customer customer);
	public Boolean deleteCustomer(Long customerId);
	public Customer editCustomer(Customer customer);
	public Customer findCustomer(Long customerId);
	public Collection<Customer> getAllCustomers();
	public Customer findCustomerByLoginAndPassword(String login, String password);

}
