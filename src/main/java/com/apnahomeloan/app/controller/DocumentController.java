package com.apnahomeloan.app.controller;

import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.apnahomeloan.app.model.Documents;
import com.apnahomeloan.app.serviceinterface.DocumentServiceI;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin("*")
public class DocumentController {

	@Autowired
	DocumentServiceI dsi;
	
	@PostMapping(value="/savedocuments", consumes=MediaType.MULTIPART_FORM_DATA_VALUE )
	public ResponseEntity<Documents>saveDocuments(@Valid @RequestPart(required = true , value="addressProof")MultipartFile addressProof,
			@RequestPart(required = true , value="pancard")MultipartFile pancard,
			@RequestPart(required = true , value="aadharcard")MultipartFile aadharcard,
			@RequestPart(required = true , value="signature")MultipartFile signature,
			@RequestPart(required = true , value="photo")MultipartFile photo,
			@RequestPart(required = true , value="incometax")MultipartFile incometax,
			@RequestPart(required = true , value="salaryslip")MultipartFile salaryslip,
			@RequestPart(required = true , value="bankcheck")MultipartFile bankcheck,
			@RequestPart(value="document")String document
			) throws IOException 
	{
		Documents d=new Documents();
		d.setAddressProof(addressProof.getBytes());
		d.setPancard(pancard.getBytes());
		d.setAadharcard(aadharcard.getBytes());
		d.setSignature(signature.getBytes());
		d.setPhoto(photo.getBytes());
		d.setIncometax(incometax.getBytes());
		d.setSalaryslip(salaryslip.getBytes());
		d.setBankcheck(bankcheck.getBytes());
		
		ObjectMapper om= new ObjectMapper();
		Documents documents=om.readValue(document, Documents.class);
				d.setDocumentId(documents.getDocumentId());
		
	
				dsi.saveDocuments(d);
	 return new ResponseEntity<Documents>(d,HttpStatus.CREATED);		
	}
	
	@GetMapping("/documents")
	public ResponseEntity<List<Documents>>getAllDocuments()
	{
		List<Documents> documentList=dsi.getAllDocuments();
		
		return new ResponseEntity<List<Documents>>(documentList,HttpStatus.OK);
	}
	
	@GetMapping("/document/{documentId}")
	public ResponseEntity<Documents>getSingleDocument(@PathVariable int documentId)
	{
		Documents document=dsi.getSingleDocument(documentId);
		return new ResponseEntity<Documents>(document,HttpStatus.OK);
	}
	
	@DeleteMapping("/document/{documentId}")
	public ResponseEntity<Documents>deleteDocument(@PathVariable int documentId)
	{
		dsi.deleteDocument(documentId);
		return new ResponseEntity<Documents>(HttpStatus.NO_CONTENT);
	}
	
	@PutMapping(value="/updatedocument/{documentId}", consumes=MediaType.MULTIPART_FORM_DATA_VALUE)
	public ResponseEntity<Documents>updateDocuments( @PathVariable int documentId,
			@RequestPart(required = true , value="addressProof")MultipartFile addressProof,
			@RequestPart(required = true , value="pancard")MultipartFile pancard,
			@RequestPart(required = true , value="aadharcard")MultipartFile aadharcard,
			@RequestPart(required = true , value="signature")MultipartFile signature,
			@RequestPart(required = true , value="photo")MultipartFile photo,
			@RequestPart(required = true , value="incometax")MultipartFile incometax,
			@RequestPart(required = true , value="salaryslip")MultipartFile salaryslip,
			@RequestPart(required = true , value="bankcheck")MultipartFile bankcheck
			) throws IOException
	{
		Documents document= new Documents();
		document.setAddressProof(addressProof.getBytes());
		document.setPancard(pancard.getBytes());
		document.setAadharcard(aadharcard.getBytes());
		document.setSignature(signature.getBytes());
		document.setPhoto(photo.getBytes());
		document.setIncometax(incometax.getBytes());
		document.setSalaryslip(salaryslip.getBytes());
		document.setBankcheck(bankcheck.getBytes());
		Documents documents=dsi.upadteDocuments(document,documentId);
		return new ResponseEntity<Documents>(documents,HttpStatus.CREATED);
	}
}
