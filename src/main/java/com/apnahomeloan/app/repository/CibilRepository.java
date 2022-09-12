package com.apnahomeloan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apnahomeloan.app.model.Cibil;

@Repository
public interface CibilRepository extends JpaRepository<Cibil, Integer> {

	
}
