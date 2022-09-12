package com.apnahomeloan.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apnahomeloan.app.model.Applicant;
<<<<<<< HEAD
import com.apnahomeloan.app.serviceinterface.ServiceInterFace;
=======
import com.apnahomeloan.app.serviceinterface.ApplicantServiceI;
>>>>>>> 60426f25ff443db62a16a9c00e0d7c4d5e65fd34


@RestController
public class ApplicantController {

	@Autowired
<<<<<<< HEAD
	private ServiceInterFace aps;
	
	@PostMapping("/Applicant")
	public ResponseEntity<Applicant> saveApplicant(@Valid @RequestBody Applicant a)
	{	
		aps.saveApplicant(a);	
		return new ResponseEntity<Applicant>(a,HttpStatus.OK);
	}	
}
=======
	private ApplicantServiceI aps;
	
	@PostMapping("/Applicant")
	public ResponseEntity<Applicant> saveApplicant(@Valid @RequestBody Applicant a){
		
		 aps.saveApplicant(a);
		
		return new ResponseEntity<Applicant>(a,HttpStatus.OK);
	}
	
    @GetMapping("/Applicants")
	public ResponseEntity<List<Applicant>> getApplicant(){
		
			List<Applicant> list=aps.getAllData();
			
		return new ResponseEntity<List<Applicant>>(list,HttpStatus.OK);
	}
    
    @PutMapping("/Applicant")
    public ResponseEntity<Applicant> updateApplicant(@RequestBody Applicant a){
    	
    							aps.saveApplicant(a);
    							
    		return new ResponseEntity<Applicant>(a,HttpStatus.CREATED);					
    }
    
    @DeleteMapping("/Applicant/{apid}")
    public ResponseEntity<Applicant> deleteApplicant(@PathVariable int apid){
    	
    					aps.deleteApplicant(apid);
    	
    		return new ResponseEntity<>(HttpStatus.NO_CONTENT);			
    }
}
>>>>>>> 60426f25ff443db62a16a9c00e0d7c4d5e65fd34
