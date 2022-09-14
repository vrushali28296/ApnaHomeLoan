package com.apnahomeloan.app.homeservice;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apnahomeloan.app.model.EmiDetails;
import com.apnahomeloan.app.repository.EmiDetailsRepository;
import com.apnahomeloan.app.serviceinterface.EmiDetailsServiceI;
@Service
public class EmiDetailsService implements EmiDetailsServiceI{

	@Autowired EmiDetailsRepository dr;
	@Override
	public EmiDetails saveEmiDetails(@Valid EmiDetails emi) {
		
		return dr.save(emi);
	}

	@Override
	public List<EmiDetails> getEmiDetails() {
		List<EmiDetails> list=dr.findAll();
		return list;
	}

	@Override
	public void deleteEmiDetails(int emiId) {
		
		
		dr.deleteById(emiId);
	}
	public EmiDetails updateDetails(EmiDetails emiD,Integer emiId) {
		Optional<EmiDetails> emi=dr.findById(emiId);
		if(emi.isPresent())
		{
			EmiDetails e=emi.get();
			e.setEmiDueDate(emiD.getEmiDueDate());
			e.setEmiAmtMonnthly(emiD.getEmiAmtMonnthly());
			e.setPreviousEmiStatus(emiD.getPreviousEmiStatus());
			return dr.save(e);
		}
		return null;
	}

}
