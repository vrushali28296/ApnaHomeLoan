package com.apnahomeloan.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apnahomeloan.app.model.Applicant;
import com.apnahomeloan.app.model.Cibil;
import com.apnahomeloan.app.serviceinterface.ApplicantServiceI;
import com.apnahomeloan.app.serviceinterface.CibilServiceInterface;

@RestController
@CrossOrigin("*")
//@RequestMapping()
public class CibilController {

	@Autowired
	private CibilServiceInterface csi;

	@Autowired
	private ApplicantServiceI asi;

	@PostMapping("/saveCibil/{cibilScore}/{applicant_id}")
	public String saveCibil(@PathVariable int cibilScore, @PathVariable int applicant_id) {

		System.out.println(cibilScore+"----"+applicant_id);
		Cibil cibil = csi.saveCibil(cibilScore, applicant_id);

		return "kk";
	}

	@GetMapping("/getCibil")
	public Integer getcibil() {

		Integer cibil = csi.getcibil();

		return cibil;
	}

}
