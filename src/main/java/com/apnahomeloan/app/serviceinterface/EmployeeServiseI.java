package com.apnahomeloan.app.serviceinterface;

import javax.validation.Valid;


import com.apnahomeloan.app.model.Employee;

public interface EmployeeServiseI {

	

	Employee saveEmployee(@Valid Employee e);
}
