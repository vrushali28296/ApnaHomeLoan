package com.apnahomeloan.app.repository;

<<<<<<< HEAD


public interface ApplicantRepository {
=======
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apnahomeloan.app.model.Applicant;

@Repository
public interface ApplicantRepository  extends JpaRepository<Applicant, Integer> {
>>>>>>> 9a360c32aad6d1baeaabebe25bbd768647cf4f99

}
