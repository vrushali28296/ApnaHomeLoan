package com.apnahomeloan.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apnahomeloan.app.model.ProfessionDetails;
import com.apnahomeloan.app.serviceinterface.ProfessionServiceI;

@RestController
@CrossOrigin("*")
public class ProfessionController {
	
	@Autowired
	ProfessionServiceI professionservice;
	
	@PostMapping(value = "/saveProfessiondetails")
	public ResponseEntity<ProfessionDetails> saveProfession(@RequestBody ProfessionDetails professiondetails){
		
			ProfessionDetails proffesion=professionservice.saveProfession(professiondetails);
			
			return new ResponseEntity<ProfessionDetails>(proffesion, HttpStatus.CREATED);
		
	}
	
	@GetMapping(value = "/getProfessiondetails")
	public ResponseEntity<List<ProfessionDetails>> getProfesstionDetails(){
		
	List<ProfessionDetails> professiondetailsList=	professionservice.getProfessiondetails();
	
	return new ResponseEntity<List<ProfessionDetails>>(professiondetailsList, HttpStatus.OK);
		
		
	}
	
	@PutMapping(value = "/updateProfessionDetails/{proffession_id}")
	public ResponseEntity<ProfessionDetails> updateProfession(@RequestBody ProfessionDetails professiondetails,  @PathVariable Integer proffession_id){
		
	ProfessionDetails profession=	professionservice.updateProfessionDetails(professiondetails, proffession_id);
	
	return new ResponseEntity<ProfessionDetails>(profession, HttpStatus.CREATED);
		
	}
	
	@DeleteMapping(value = "/deleteProfessionDetails/{proffession_id}")
	public ResponseEntity<ProfessionDetails> deleteProfession(@PathVariable Integer proffession_id){
		professionservice.deleteprofession(proffession_id);
		
		return new ResponseEntity<ProfessionDetails>(HttpStatus.NO_CONTENT);
		
		
	}
	

}
