package edu.mum.cs544.bank.dao;

import java.util.Collection;

import edu.mum.cs544.bank.domain.Account;



public interface IAccountDAO {
	public void saveAccount(Account account);
	public void updateAccount(Account account);
	public Account loadAccount(long accountnumber);
	public Collection<Account> getAccounts();
}
