package com.gproconsulting.prestation.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gproconsulting.prestation.domain.Customer;
import com.gproconsulting.prestation.service.CustomerServiceInterface;
@RestController
public class CustomerController {
@Autowired
private CustomerServiceInterface customerInterface;
@GetMapping("allcustomers")
public Collection<Customer>retrouverAllCustomer(){
	return customerInterface.getAllCustomers();
}
@GetMapping("/customerById:{id}")
public Customer retrouveCustomer(@PathVariable long id) {
	return  customerInterface.findCustomer(id);

	
}

@DeleteMapping("/deleteCustomer:{id}")
public void deleteCustomer(@PathVariable long id) {
	customerInterface.deleteCustomer(id);
}
@PostMapping("/saveCustomer")
public Customer createCustomer(@RequestBody Customer customer) {
	return  customerInterface.saveCustomer(customer) ;
}
@PutMapping("/updateCustomer")
public Customer updateCustomer(@RequestBody Customer customer) {
	return customerInterface.editCustomer(customer);
}
}
