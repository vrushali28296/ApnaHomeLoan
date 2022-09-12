package com.apnahomeloan.app.serviceinterface;

import java.util.List;

import com.apnahomeloan.app.model.Documents;

public interface DocumentServiceI {

	public void saveDocuments(Documents d);

	public List<Documents> getAllDocuments();

	public Documents getSingleDocument(int documentId);

	public void deleteDocument(int documentId);

	public Documents upadteDocuments(Documents document, int documentId);


}
