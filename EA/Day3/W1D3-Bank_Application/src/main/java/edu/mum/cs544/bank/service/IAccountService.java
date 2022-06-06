package edu.mum.cs544.bank.service;

import java.util.Collection;

import edu.mum.cs544.bank.domain.Account;



public interface IAccountService {
    public Account createAccount(long accountNumber, String customerName);
    public Account getAccount(long accountNumber);
    public Collection<Account> getAllAccounts();
    public void deposit (long accountNumber, double amount);
    public void withdraw (long accountNumber, double amount);
    public void depositEuros (long accountNumber, double amount);
    public void withdrawEuros (long accountNumber, double amount);
    public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description);
}
