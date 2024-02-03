package com.m.cms.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.m.cms.entity.Customer;
import com.m.cms.repository.CustomerRepository;
import com.m.cms.service.CustomerService;

@Service
public class CustomerServiceImplementation implements CustomerService {

	private CustomerRepository customerRepository;
	
	
	public CustomerServiceImplementation(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}


	@Override
	public List<Customer> getAllCustomers() {
		
		return customerRepository.findAll();
	}


	@Override
	public Customer saveCustomer(Customer customer) {
		
		return customerRepository.save(customer);
	}


	@Override
	public Customer getCustomerById(Long id) {
		
		return customerRepository.findById(id).get();
	}


	@Override
	public Customer updateCustomer(Customer customer) {
		return customerRepository.save(customer);
	}


	@Override
	public void deleteCustomerById(Long id) {
		 customerRepository.deleteById(id);
		
	}


	


	




	

}
