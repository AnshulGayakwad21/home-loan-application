package com.hla.in.homeloanapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hla.in.homeloanapplication.entities.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
	

}

