package com.apnahomeloan.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apnahomeloan.app.model.Employee;
import com.apnahomeloan.app.serviceinterface.EmployeeServiseI;


@RestController
public class EmployeeController {

	@Autowired private EmployeeServiseI esr;

	@PostMapping("/Employee")
	public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee e){
	
								Employee	emp=esr.saveEmployee(e);
	
								return new ResponseEntity<>(emp,HttpStatus.OK);
}
 }
