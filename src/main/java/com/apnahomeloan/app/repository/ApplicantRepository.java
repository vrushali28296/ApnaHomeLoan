package com.apnahomeloan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apnahomeloan.app.model.Applicant;

@Repository
public interface ApplicantRepository  extends JpaRepository<Applicant, Integer> {

  public Applicant findByApplicantid(Integer applicantid );

}
