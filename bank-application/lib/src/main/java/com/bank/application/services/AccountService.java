package com.bank.application.services;


import java.util.List;
import java.util.Optional;

import com.bank.application.model.BankAccount;




public interface AccountService {
	void addBankAccount(BankAccount account);
	List<BankAccount> viewAllAccounts();
	Optional<BankAccount> getById(int accno);
	void updateBankAccount(BankAccount account);
	void deleteBankAccount(int  accountid);
	
}
