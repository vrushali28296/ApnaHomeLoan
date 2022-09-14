package com.apnahomeloan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apnahomeloan.app.model.Cibil;
import com.apnahomeloan.app.model.Customer;

@Repository
public interface CustomerRepositary extends JpaRepository<Customer, Integer>
{

	public Customer findByCustomerid(Integer customerid);	
	
}
