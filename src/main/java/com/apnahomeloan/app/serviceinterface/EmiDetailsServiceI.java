package com.apnahomeloan.app.serviceinterface;

import java.util.List;

import javax.validation.Valid;

import com.apnahomeloan.app.model.EmiDetails;

public interface EmiDetailsServiceI {

	EmiDetails saveEmiDetails(@Valid EmiDetails emi);

	List<EmiDetails> getEmiDetails();

	void deleteEmiDetails(int emiId);

	

}
