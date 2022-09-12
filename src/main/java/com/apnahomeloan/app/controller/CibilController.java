package com.apnahomeloan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apnahomeloan.app.model.Cibil;
import com.apnahomeloan.app.serviceinterface.ApplicantServiceI;
import com.apnahomeloan.app.serviceinterface.CibilServiceInterface;

@RestController
public class CibilController {

	@Autowired
	private CibilServiceInterface csi;
	
	@Autowired
	private ApplicantServiceI asi;
	
	@PostMapping("/Cibil/{cibilScore}/{applicant_id}")
	public ResponseEntity<Cibil> saveCibil(@PathVariable int cibilScore,@PathVariable int applicant_id ){
		
		
						Cibil cibil=csi.saveCibil(cibilScore,applicant_id);
									
			return new ResponseEntity<Cibil>(cibil,HttpStatus.OK);							
	}
	@GetMapping("/getCibil")
	public Integer  getcibil() {
		
			Integer cibil=csi.getcibil(); 
			
			return cibil;
	}

	
}
