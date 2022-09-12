package com.apnahomeloan.app.homeservice;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apnahomeloan.app.model.Applicant;
import com.apnahomeloan.app.model.Cibil;
import com.apnahomeloan.app.repository.ApplicantRepository;
import com.apnahomeloan.app.repository.CibilRepository;
import com.apnahomeloan.app.repository.CustomerRepositary;
import com.apnahomeloan.app.serviceinterface.CibilServiceInterface;

@Service
public class CibilServiceImpl implements CibilServiceInterface {

	@Autowired
	private CibilRepository cr;
	
	@Autowired
	private ApplicantRepository apr;
	
	@Override
	public Integer getcibil() {
		
		int min=600;
		int max=900;
		int cibil	=(int) (Math.random()*(max-min+1)+min);
		
		return cibil;
	}
	
	@Override
	public Cibil saveCibil(int cibilScore, int applicant_id) {
        
			
		
	Applicant applicant=apr.findByApplicantid(applicant_id);
		
		
		Cibil c=new Cibil();    
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    Date date = new Date();  
		c.setCibilScoreDateTime(formatter.format(date));
		c.setCibilRemark("PENDING");
		
		if(cibilScore>=750) {
			c.setCibilScore(cibilScore);
			c.setCibilStatus("Approve");
			applicant.setCibil(c);
			cr.save(c); //cibil saved
			apr.save(applicant); //customer save
			//apllic.setCustomer(customer)
			//apr.save();
		}
		else
		{
			c.setCibilScore(cibilScore);
			c.setCibilStatus("Rejrcted");
			applicant.setCibil(c);
			cr.save(c);
			apr.save(applicant);
		}
		
		return null;
	}


	
	
	
}
