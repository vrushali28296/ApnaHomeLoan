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
import org.springframework.web.bind.annotation.RestController;

import com.apnahomeloan.app.model.EmiDetails;
import com.apnahomeloan.app.serviceinterface.EmiDetailsServiceI;



@RestController
public class EmiDetailsController {


		@Autowired private EmiDetailsServiceI emisr;

		@PostMapping("/EmiDetails")
		public ResponseEntity<EmiDetails> save_EmiDetails(@Valid @RequestBody EmiDetails emi){
			EmiDetails emd=emisr.saveEmiDetails(emi);
			return new ResponseEntity<>(emd,HttpStatus.OK);
		}
		@GetMapping("/EmiDetails")
		public ResponseEntity<List<EmiDetails>> get_EmiDetails()
		{
			List<EmiDetails> list=emisr.getEmiDetails();
			return new ResponseEntity<List<EmiDetails>> (list,HttpStatus.OK);
		}
		@PutMapping("/EmiDetails")
		public ResponseEntity<EmiDetails> update_EmiDetails(@RequestBody EmiDetails emi)
		{
			EmiDetails emd=emisr.saveEmiDetails(emi);
			return new ResponseEntity<EmiDetails> (emd,HttpStatus.OK);
		}
		@DeleteMapping("/EmiDetails/{emiId}")
		public ResponseEntity<EmiDetails> delete_EmiDetails(@PathVariable int emiId )
		{
			emisr.deleteEmiDetails(emiId);
			return new ResponseEntity<EmiDetails>(HttpStatus.NO_CONTENT);
		}
}