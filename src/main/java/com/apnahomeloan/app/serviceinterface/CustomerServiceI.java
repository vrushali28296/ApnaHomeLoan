package com.apnahomeloan.app.serviceinterface;

import java.util.List;

import com.apnahomeloan.app.model.Customer;

public interface CustomerServiceI 
{

	public Customer saveCustomer(Customer customer);

	public List<Customer> getCustomers();

	public Customer updateCustomer(Customer customer, Integer customer_id);

	public void deleteCustomer(Integer customer_id);

}
