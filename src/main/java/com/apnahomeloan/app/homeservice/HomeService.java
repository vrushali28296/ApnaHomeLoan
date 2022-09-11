package com.apnahomeloan.app.homeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apnahomeloan.app.model.Applicant;
import com.apnahomeloan.app.repository.ApplicantRepository;
import com.apnahomeloan.app.serviceinterface.ServiceInterFace;

@Service
public class HomeService implements ServiceInterFace{

	@Autowired private ApplicantRepository apr;
	
	@Override
	public void saveApplicant(Applicant a) {
		
		apr.save(a);
		
		
	}

}
