package com.apnahomeloan.app.serviceinterface;

<<<<<<< HEAD
public interface ApplicantServiceI {

	
	
=======

import java.util.List;
import javax.validation.Valid;
import com.apnahomeloan.app.model.Applicant;

public interface ApplicantServiceI
{

public void saveApplicant(   Applicant a);

public 	List<Applicant> getAllData();

public	void deleteApplicant(int apid);

}
>>>>>>> 60426f25ff443db62a16a9c00e0d7c4d5e65fd34
