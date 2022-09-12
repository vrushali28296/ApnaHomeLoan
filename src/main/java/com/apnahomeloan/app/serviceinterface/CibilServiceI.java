package com.apnahomeloan.app.serviceinterface;

import java.util.List;

import com.apnahomeloan.app.model.Cibil;

public interface CibilServiceI {
	Cibil  saveCibil(Cibil  cibil);
	public List<Cibil>getCibil();
	public Cibil updateCibil(Cibil cibil,Integer csid );
	public void deleteCibil(Integer csid);
	}

