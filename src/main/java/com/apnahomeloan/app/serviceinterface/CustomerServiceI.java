package com.apnahomeloan.app.serviceinterface;

import java.util.List;

import com.apnahomeloan.app.model.Customer;

public interface CustomerServiceI 
{

	public Customer saveCustomer(Customer customer);

	public List<Customer> getCustomers();

	public Customer updateCustomer(Customer customer, Integer customerid);

	public void deleteCustomer(Integer customerid);

}
