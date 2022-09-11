package com.apnahomeloan.app.controller;


import com.apnahomeloan.app.model.Cibil;
import com.apnahomeloan.app.serviceinterface.CibilServiceI;

@RestController
public class CibilController {
	
	@Autowired
	CibilServiceI  csi;
	@PostMapping(value = "/saveCibil")
	public ResponseEntity<Cibil> saveCibil( @RequestBody Cibil cibil)
	{
		
		Cibil c= CibilServiceI.saveCibil(cibil);
		 return	new ResponseEntity<Cibil>(c,HttpStatus.OK);

}
