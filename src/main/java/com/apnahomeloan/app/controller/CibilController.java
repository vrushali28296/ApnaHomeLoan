package com.apnahomeloan.app.controller;


import java.util.List;

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

import com.apnahomeloan.app.model.Cibil;
import com.apnahomeloan.app.model.Customer;
import com.apnahomeloan.app.serviceinterface.CibilServiceI;


@RestController
@CrossOrigin("*")
public class CibilController {
	
	@Autowired
	CibilServiceI  csi ;
	@PostMapping(value = "/saveCibil")
	public ResponseEntity<Cibil> saveCibil( @RequestBody Cibil cibil)
	{
		
		Cibil cb=csi.saveCibil(cibil);
		 return	new ResponseEntity<Cibil>(cb,HttpStatus.OK);
}
	@GetMapping(value="/getCibil")
	public ResponseEntity<List<Cibil>>getCibil()
	{
		List<Cibil> cibil_list=csi.getCibil();
		return new ResponseEntity<List<Cibil>>(cibil_list,HttpStatus.OK);
	}
	
	@PutMapping(value = "/updateCibil/{csid}")
	public ResponseEntity<Cibil> updateCibil(@RequestBody Cibil cibil,@PathVariable Integer csid)
	{
		Cibil cibi=csi.updateCibil(cibil,csid);
		return new ResponseEntity<Cibil>(cibi,HttpStatus.CREATED);
	}
	
	@DeleteMapping(value = "/deleteCibil/{csid}")
	public ResponseEntity deleteCibil(@PathVariable Integer csid)
	{
		csi.deleteCibil(csid);
		return new ResponseEntity(HttpStatus.NO_CONTENT);			
	}
}
		
	

	