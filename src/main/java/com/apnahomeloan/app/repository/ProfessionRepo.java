package com.apnahomeloan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apnahomeloan.app.model.ProfessionDetails;

@Repository
public interface ProfessionRepo extends JpaRepository<ProfessionDetails, Integer> {

	public ProfessionDetails findAllByProffessionid(Integer proffessionid);
}
