package com.apnahomeloan.app.homeservice;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apnahomeloan.app.model.Applicant;
import com.apnahomeloan.app.repository.ApplicantRepository;
import com.apnahomeloan.app.serviceinterface.ApplicantServiceI;


@Service
public class ApplicantService implements ApplicantServiceI{

	@Autowired private ApplicantRepository apr;
	
	@Override
	public void saveApplicant(Applicant a) {
		

		apr.save(a);
		
	}

	@Override
	public List<Applicant> getAllData() {
		
	List<Applicant> list=apr.findAll();
	
	
		return list;
	}

	@Override
	public void deleteApplicant(int applicantid) {
		
		
		apr.deleteById(applicantid);
		
	}

	@Override
	public Applicant getApplicantBtId(int applicantid) {
		 
		return apr.findByApplicantid(applicantid);
		
	}




}
