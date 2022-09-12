package com.apnahomeloan.app.serviceinterface;
	

import java.util.List;

import com.apnahomeloan.app.model.Applicant;

public interface ApplicantServiceI
{

public void saveApplicant(   Applicant a);

public 	List<Applicant> getAllData();

public	void deleteApplicant(int apid);

public Applicant getApplicantBtId(int applicant_id);

}
