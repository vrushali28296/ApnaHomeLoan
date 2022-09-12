package com.apnahomeloan.app.serviceinterface;

import com.apnahomeloan.app.model.Cibil;

public interface CibilServiceInterface {

	Cibil saveCibil(int cibilScore, int apid);

	Integer getcibil();

}
