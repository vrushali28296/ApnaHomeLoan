package com.apnahomeloan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apnahomeloan.app.model.Customer;
import com.apnahomeloan.app.serviceinterface.CustomerServiceI;

@RestController
public class CustomerController 
{
	
		@Autowired 
		CustomerServiceI customerServiceI;
		
		@PostMapping(value = "/saveCustomer")
		public ResponseEntity<Customer> saveCustomer( @RequestBody Customer customer)
		{
			
			Customer c= customerServiceI.saveCustomer(customer);
			 return	new ResponseEntity<Customer>(c,HttpStatus.OK);
		}
}
