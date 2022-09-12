package com.apnahomeloan.app.serviceinterface;

import java.util.List;

import javax.validation.Valid;



import com.apnahomeloan.app.model.ProfessionDetails;


public interface ProfessionServiceI {

	public ProfessionDetails saveProfession(@Valid ProfessionDetails professiondetails);

	public List<ProfessionDetails> getProfessiondetails();

	public ProfessionDetails updateProfessionDetails(ProfessionDetails professiondetails, Integer professionId);

	public void deleteprofession(Integer professionId);

}
