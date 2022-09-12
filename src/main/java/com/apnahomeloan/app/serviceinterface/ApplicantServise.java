package com.apnahomeloan.app.serviceinterface;

import java.util.List;

import javax.validation.Valid;

import com.apnahomeloan.app.model.Applicant;

public interface ApplicantServise {

	void saveApplicant(   Applicant a);

	List<Applicant> getAllData();

	void deleteApplicant(int apid);

	Applicant	getApplicantBtId(int applicant_id);

}
     