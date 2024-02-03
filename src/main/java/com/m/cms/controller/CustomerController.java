package com.m.cms.controller;

import java.security.PublicKey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.m.cms.entity.Customer;
import com.m.cms.service.CustomerService;

@Controller
public class CustomerController {
	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	/*handler method to hendle list cutomer and retunr mode and view*/	
	
	@GetMapping("/customers")
	public String listCustomers(Model model){
		model.addAttribute("customers", customerService.getAllCustomers());
		return "customers";
	}
	
	@GetMapping("/customers/new")
	public String createCustomerForm(Model model) {
		
		// create customer object to hold customer data 
		Customer customer = new Customer();
		
		model.addAttribute("customer", customer);
		return "create_customer";
	}
	
	@PostMapping("/customers")
	public String saveCustomer(@ModelAttribute("customer") Customer customer) {
		customerService.saveCustomer(customer);
		return "redirect:/customers";
	}
	
	@GetMapping("/customers/edit/{id}")
	public String editCustomerForm(@PathVariable Long id, Model model) {
		model.addAttribute("customer",customerService.getCustomerById(id));
		return "edit_customer";
	}
	
	@PostMapping("/customers/{id}")
	public String updateCustomer(@PathVariable Long id, 
			@ModelAttribute("customer") Customer customer,Model model) {
		
		
		
		//get customer from database by id
	
		Customer haicustomer=customerService.getCustomerById(id);
		haicustomer.setId(id);
		haicustomer.setFirstName(customer.getFirstName());
		haicustomer.setLastName(customer.getLastName());
		haicustomer.setStreet(customer.getStreet());
		haicustomer.setAddress(customer.getAddress());
		haicustomer.setCity(customer.getCity());
		haicustomer.setEmail(customer.getEmail());
		haicustomer.setPhone(customer.getPhone()); 
		
		
		// save update Customer object
		
		customerService.updateCustomer(haicustomer);
		return "redirect:/customers";

		
	}
	
	// hendler method to handle delete customer request....
	
	@GetMapping("/customers/{id}")
	public String deleteCustomer(@PathVariable Long id) {
		customerService.deleteCustomerById(id);
		return "redirect:/customers";
	}
	
	
	
}
