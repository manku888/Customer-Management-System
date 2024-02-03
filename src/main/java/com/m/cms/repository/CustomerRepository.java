package com.m.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m.cms.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{



}
