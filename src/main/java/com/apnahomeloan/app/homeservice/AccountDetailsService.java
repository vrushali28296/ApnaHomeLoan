package com.apnahomeloan.app.homeservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apnahomeloan.app.model.AccountDetails;
import com.apnahomeloan.app.repository.AccountDetailsRepository;
import com.apnahomeloan.app.serviceinterface.AccountDetailsI;

@Service
public class AccountDetailsService implements AccountDetailsI {

	@Autowired
	AccountDetailsRepository adr;
	@Override
	public AccountDetails saveAccount(AccountDetails account) {
		
		return adr.save(account);
	}

	@Override
	public List<AccountDetails> getAccount() {
		List< AccountDetails>aclist=adr.findAll();
		return aclist;
	}

	@Override
	public AccountDetails updateAccount(AccountDetails account, Integer acid) {
	
		return null;
	}

	@Override
	public void deleteAccount(Integer acid) {
		adr.deleteById(acid);
		
	}

}
