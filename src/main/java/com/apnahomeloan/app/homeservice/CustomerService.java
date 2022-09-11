package com.apnahomeloan.app.homeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apnahomeloan.app.model.Customer;
import com.apnahomeloan.app.repository.CustomerRepositary;
import com.apnahomeloan.app.serviceinterface.CustomerServiceI;

@Service
public class CustomerService implements CustomerServiceI
{
	@Autowired
	CustomerRepositary customerRepositary;

	@Override
	public Customer saveCustomer(Customer customer) 
	{	
		return customerRepositary.save(customer);
	}

}
