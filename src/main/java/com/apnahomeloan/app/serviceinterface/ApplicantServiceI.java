package com.apnahomeloan.app.serviceinterface;

import javax.validation.Valid;

import com.apnahomeloan.app.model.Applicant;

public interface ApplicantServiceI {

	void saveApplicant(@Valid Applicant a);

}
     