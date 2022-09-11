package com.apnahomeloan.app.serviceinterface;

import java.util.List;

import javax.validation.Valid;

import com.apnahomeloan.app.model.Applicant;

public interface ServiceInterface {

	void saveApplicant(   Applicant a);

	List<Applicant> getAllData();

	void deleteApplicant(int apid);

}
     