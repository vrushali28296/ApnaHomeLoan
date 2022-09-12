package com.apnahomeloan.app.homeservice;

import java.util.List;

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

	@Override
	public List<Customer> getCustomers() 
	{
		
		return customerRepositary.findAll();
	}

	@Override
	public Customer updateCustomer(Customer customer, Integer customer_id) 
	{
		
<<<<<<< HEAD
=======
		
>>>>>>> 60426f25ff443db62a16a9c00e0d7c4d5e65fd34
		return null;
	}

	@Override
	public void deleteCustomer(Integer customer_id) 
	{
		customerRepositary.deleteById(customer_id);
	}

}
