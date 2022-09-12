package com.apnahomeloan.app.homeservice;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apnahomeloan.app.model.ProfessionDetails;
import com.apnahomeloan.app.repository.ProfessionRepo;
import com.apnahomeloan.app.serviceinterface.ProfessionServiceI;

@Service
public class ProfessionHomeService implements ProfessionServiceI{
	
	@Autowired
	ProfessionRepo professionrepository;

	@Override
	public ProfessionDetails saveProfession( ProfessionDetails professiondetails) {
		
		return professionrepository.save(professiondetails);
	}

	@Override
	public List<ProfessionDetails> getProfessiondetails() {
		
		return professionrepository.findAll();
	}

	@Override
	public ProfessionDetails updateProfessionDetails(ProfessionDetails professiondetails, Integer professionId) {
		
		
		return null;
	}

	@Override
	public void deleteprofession(Integer professionId) {
		professionrepository.deleteById(professionId);
		
	}

}
