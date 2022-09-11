package com.apnahomeloan.app.homeservice;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.apnahomeloan.app.model.Applicant;
import com.apnahomeloan.app.repository.ApplicantRepository;
import com.apnahomeloan.app.serviceinterface.ServiceInterface;

@Service
public class HomeService implements ServiceInterface{

	@Autowired
	private ApplicantRepository apr;
	
	@Override
	public void saveApplicant(Applicant a) {
		
		 apr.save(a);
		
		
		
	}

}
