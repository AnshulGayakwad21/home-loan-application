package com.hla.in.homeloanapplication.service;

import java.time.LocalDate;
import java.util.List;

import com.hla.in.homeloanapplication.entities.Customer;
import com.hla.in.homeloanapplication.exceptions.CustomerNotFoundException;

public interface ICustomerService  {
	
	public Customer addCustomer(Customer customer) ;
	public Customer updateCustomer(Customer customer) throws CustomerNotFoundException, Exception;
	public Customer deleteCustomer(int custid) throws CustomerNotFoundException;
	public Customer viewCustomer(int custid) throws CustomerNotFoundException;
	public List<Customer> viewAllCustomers();
	public List<Customer> viewCustomerList(LocalDate dateOfApplication);


}


