package com.apnahomeloan.app.homeservice;

import com.apnahomeloan.app.model.Cibil;
import com.apnahomeloan.app.repository.CibilRepository;
import com.apnahomeloan.app.serviceinterface.CibilServiceI;

@Service
public class CibilService implements CibilServiceI{
	@Autowired
	CibilRepository cr;

	@Override
	public Cibil saveCibil(Cibil cibil) {
		
		return cr.saveCibil(cibil);
	}

}
