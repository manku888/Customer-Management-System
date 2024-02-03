package com.m.cms.service;

import java.util.List;

import com.m.cms.entity.Customer;

public interface CustomerService {

	List<Customer> getAllCustomers();

	
	Customer saveCustomer(Customer customer);
	
	
	Customer getCustomerById(Long id);
	Customer updateCustomer(Customer customer);
	
	void deleteCustomerById(Long id);
}
