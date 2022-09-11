package com.apnahomeloan.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apnahomeloan.app.model.Employee;
import com.apnahomeloan.app.serviceinterface.EmployeeServiseI;


@RestController
public class EmployeeController {

	@Autowired private EmployeeServiseI esr;

	@PostMapping("/Employee")
	public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee e){
	
								Employee emp=esr.saveEmployee(e);
	
								return new ResponseEntity<>(emp,HttpStatus.OK);
}
 
@GetMapping("/Employees")
public ResponseEntity<List<Employee>> getEmployee()
{
	List<Employee> list=esr.getEmployee();
	return new ResponseEntity<List<Employee>>(list,HttpStatus.OK);
	
}
@PutMapping("/Employee")
public ResponseEntity<Employee> updateEmployee(@RequestBody Employee e)
{
	Employee emp=esr.saveEmployee(e);
	return new ResponseEntity<Employee>(emp,HttpStatus.OK);
}
@DeleteMapping("/Employee/{employeeid}")
public ResponseEntity<Employee> deleteEmployee(@PathVariable int employeeid)
{
	esr.deleteEmployee(employeeid);
	return new ResponseEntity<Employee>(HttpStatus.NO_CONTENT);
}
}