package com.apnahomeloan.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apnahomeloan.app.model.AccountDetails;

@Repository
public interface AccountDetailsRepository extends JpaRepository<AccountDetails,Integer> {
	
public AccountDetails  findAllByAccountId(int accountid);
}
