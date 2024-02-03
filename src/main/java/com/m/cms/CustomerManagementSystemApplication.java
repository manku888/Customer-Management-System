package com.m.cms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.m.cms.entity.Customer;
import com.m.cms.repository.CustomerRepository;

@SpringBootApplication
public class CustomerManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CustomerManagementSystemApplication.class, args);
	}
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void run(String... args) throws Exception {
		
//		Customer customer1 = new Customer("Manish","Singh","AyodhyaBypass Road","rajvansh Colony","Bhopal","ms@gmail.com","88888888");
//		customerRepository.save(customer1);
//		
//		Customer customer2 = new Customer("Manku","Singh","AyodhyaBypass Road","rajvansh Colony","Bhopal","ms@gmail.com","9999999");
//		customerRepository.save(customer2);
//		
//		Customer customer3 = new Customer("Tony","Singh","AyodhyaBypass Road","rajvansh Colony","Bhopal","ts@gmail.com","111111");
//		customerRepository.save(customer3);
//		Customer customer4 = new Customer("priveen","Malvi","AyodhyaBypass Road","rajvansh Colony","Bhopal","pm@gmail.com","55555");
//		customerRepository.save(customer4);
	} 

}
