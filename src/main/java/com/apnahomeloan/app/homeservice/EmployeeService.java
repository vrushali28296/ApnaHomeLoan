package com.apnahomeloan.app.homeservice;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.apnahomeloan.app.model.Employee;
import com.apnahomeloan.app.repository.EmployeeRepository;
import com.apnahomeloan.app.serviceinterface.EmployeeServiseI;

@Service
public class EmployeeService implements EmployeeServiseI{

	@Autowired private EmployeeRepository er;

	

	@Override
	public Employee saveEmployee( Employee e) {


		return null;
	}

		

	



	

	



	



	
	
	
}
