package com.apnahomeloan.app.homeservice;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import javax.swing.text.Document;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.apnahomeloan.app.model.Documents;
import com.apnahomeloan.app.repository.DocumentRepository;
import com.apnahomeloan.app.serviceinterface.DocumentServiceI;
@Service
public class DocumentService implements DocumentServiceI{

	@Autowired
	DocumentRepository dr;

	@Override
	public void saveDocuments(Documents d) {

		dr.save(d);
	}

	@Override
	public List<Documents> getAllDocuments() {
		return dr.findAll();
	}

	@Override
	public Documents getSingleDocument(int documentId) {
	
		return dr.findAllByDocumentId(documentId);
			
	}

	@Override
	public void deleteDocument(int documentId) {

		dr.deleteById(documentId);
	}



	@Override
	public Documents upadteDocuments(Documents document, int documentId) {

		Optional<Documents>op=dr.findById(documentId);
		if (op.isPresent())
		{
			Documents document1=op.get();
			
			document1.setAddressProof(document.getAddressProof());
			document1.setPancard(document.getPancard());
			document1.setAadharcard(document.getAadharcard());
			document1.setSignature(document.getSignature());
			document1.setPhoto(document.getPhoto());
			document1.setIncometax(document.getIncometax());
			document1.setSalaryslip(document.getSalaryslip());
			document1.setBankcheck(document.getBankcheck());
			
		return dr.save(document1);
			
		}
		
		else
		{
			System.out.println("Not Updated");
			return null;
		}
	}
	

	
	
	
}
