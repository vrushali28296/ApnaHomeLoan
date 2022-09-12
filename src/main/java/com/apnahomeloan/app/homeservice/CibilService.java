package com.apnahomeloan.app.homeservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apnahomeloan.app.model.Cibil;
import com.apnahomeloan.app.repository.CibilRepository;
import com.apnahomeloan.app.serviceinterface.CibilServiceI;

@Service
public class CibilService implements CibilServiceI{
	@Autowired
	CibilRepository cr;

	@Override
	public Cibil saveCibil(Cibil cibil) {
		
		return cr.save(cibil);
	}

	@Override
	public List<Cibil> getCibil() {
		List<Cibil>listcibil=cr.findAll();
		return listcibil;
	}

	@Override
	public Cibil updateCibil(Cibil cibil, Integer csid) {
		
		return null;
	}

	@Override
	public void deleteCibil(Integer csid) {
		cr.deleteById(csid);
		
	}

}
