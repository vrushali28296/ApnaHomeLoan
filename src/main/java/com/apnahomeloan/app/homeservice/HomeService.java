package com.apnahomeloan.app.homeservice;

<<<<<<< HEAD
public class HomeService {
=======
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
>>>>>>> ab5a7bd2d1c7aba5fa3194275a7c0e699c55a933

}
