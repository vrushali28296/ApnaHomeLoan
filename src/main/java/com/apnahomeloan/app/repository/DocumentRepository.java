package com.apnahomeloan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apnahomeloan.app.model.Documents;

@Repository
public interface DocumentRepository extends JpaRepository<Documents, Integer>{

public	Documents findAllByDocumentId(int documentId);

}
