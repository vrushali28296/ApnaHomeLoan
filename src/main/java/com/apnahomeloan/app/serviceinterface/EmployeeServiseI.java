package com.apnahomeloan.app.serviceinterface;

import java.util.List;

import javax.validation.Valid;


import com.apnahomeloan.app.model.Employee;

public interface EmployeeServiseI {

	

	List<Employee> getEmployee();

	Employee saveEmployee(@Valid Employee e);


	void deleteEmployee(int employeeid);
}
