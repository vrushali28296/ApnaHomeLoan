package com.apnahomeloan.app.serviceinterface;

import com.apnahomeloan.app.model.AccountDetails;
import java.util.List;

public interface AccountDetailsI {
	public AccountDetails saveAccount(AccountDetails account);
	public List<AccountDetails>getAccount();
	public AccountDetails updateAccount(AccountDetails account,Integer acid);
	public void deleteAccount(Integer acid);

}
