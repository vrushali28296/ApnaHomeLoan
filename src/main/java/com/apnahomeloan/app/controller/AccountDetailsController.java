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

import com.apnahomeloan.app.model.AccountDetails;
import com.apnahomeloan.app.serviceinterface.AccountDetailsI;


@RestController
@CrossOrigin("*")
public class AccountDetailsController {
	
	
		
		@Autowired
		AccountDetailsI adi ;
		@PostMapping(value = "/saveAccount")
		public ResponseEntity<AccountDetails> saveAccount( @RequestBody AccountDetails account)
		{
			
			AccountDetails ad=adi.saveAccount(account);
			 return	new ResponseEntity<AccountDetails>(ad,HttpStatus.OK);
	}
		@GetMapping(value="/getAccount")
		public ResponseEntity<List<AccountDetails>>getAccount()
		{
			List<AccountDetails> aclist=adi.getAccount();
			return new ResponseEntity<List<AccountDetails>>(aclist,HttpStatus.OK);
		}
		
		@PutMapping(value = "/updateAccount/{acid}")
		public ResponseEntity<AccountDetails> updateAccount(@RequestBody AccountDetails account,@PathVariable Integer acid)
		{
			AccountDetails ade=adi.updateAccount(account,acid);
			return new ResponseEntity<AccountDetails>(ade,HttpStatus.CREATED);
		}
		
		@DeleteMapping(value = "/deleteAccount/{acid}")
		public ResponseEntity deleteAccount(@PathVariable Integer acid)
		{
			adi.deleteAccount(acid);
			return new ResponseEntity(HttpStatus.NO_CONTENT);			
		}
	}
			
		

		

