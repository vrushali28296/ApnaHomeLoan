package com.apnahomeloan.app.serviceinterface;


import java.util.List;
import javax.validation.Valid;
import com.apnahomeloan.app.model.Applicant;

public interface ApplicantServiceI
{

public void saveApplicant(   Applicant a);

public 	List<Applicant> getAllData();

public	void deleteApplicant(int apid);

}
