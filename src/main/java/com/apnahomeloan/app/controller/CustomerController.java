package com.apnahomeloan.app.controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apnahomeloan.app.model.Customer;
import com.apnahomeloan.app.serviceinterface.CustomerServiceI;

@RestController
@CrossOrigin("*")
public class CustomerController 
{
	
		@Autowired 
		CustomerServiceI customerServiceI;
		
		@PostMapping(value = "/saveCustomer")
		public ResponseEntity<Customer> saveCustomer(@Valid @RequestBody Customer customer)
		{
			Customer c= customerServiceI.saveCustomer(customer);
			 return	new ResponseEntity<Customer>(c,HttpStatus.CREATED);
		}

		@GetMapping(value = "/getCustomers") 
		public ResponseEntity<List<Customer>> getCustomers()
		{
			List<Customer> customer_list=customerServiceI.getCustomers();
			return new ResponseEntity<List<Customer>>(customer_list,HttpStatus.OK);
		}
		
		@PutMapping(value = "/updateCustomer/{customer_id}")
		public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer,@PathVariable Integer customer_id)
		{
			Customer cust=customerServiceI.updateCustomer(customer,customer_id);
			return new ResponseEntity<Customer>(cust,HttpStatus.CREATED);
		}
		
		@DeleteMapping(value = "/deleteCustomer/{customer_id}")
		public ResponseEntity deleteCustomer(@PathVariable Integer customer_id)
		{
			customerServiceI.deleteCustomer(customer_id);
			return new ResponseEntity(HttpStatus.NO_CONTENT);			
		}
}


//
//
//{
//	  "customer_age": 45,
//	  "customer_name": "vk",
//	  "customer_gender": "female",
//	  "customer_emailid": "vk@gmail.com",
//	  "customer_dob": "28/2/96",
//	  "customer_address": "pune",
//	  "customer_mobno": "9762065593",
//	  "customer_proposedLoanAmt": "5000000",
//	  "customer_totalLoanAmt": "10000000"
//	}
