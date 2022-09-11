package com.apnahomeloan.app.homeservice;

import java.util.List;

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

		return	er.save(e);
		
	}



	@Override
	public List<Employee> getEmployee() {
		List<Employee> list=er.findAll();
		return list;
	}



	@Override
	public void deleteEmployee(int employeeid) {
		er.deleteById(employeeid);
		
	}



	

		

	



	

	



	



	
	
	
}
