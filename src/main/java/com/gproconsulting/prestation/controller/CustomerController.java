package com.gproconsulting.prestation.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.gproconsulting.prestation.domain.Customer;
import com.gproconsulting.prestation.service.CustomerServiceInterface;
@RestController("customer")
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
}
