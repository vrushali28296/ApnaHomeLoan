package com.apnahomeloan.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apnahomeloan.app.model.Applicant;
import com.apnahomeloan.app.serviceinterface.ServiceInterface;

@RestController
public class ApplicantController {

	@Autowired
	private ServiceInterface aps;
	
	@PostMapping("/Applicant")
	public ResponseEntity<Applicant> saveApplicant(@Valid @RequestBody Applicant a)
	{	
		aps.saveApplicant(a);	
		return new ResponseEntity<Applicant>(a,HttpStatus.OK);
	}	
}