package com.bank.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.application.model.BankAccount;
import com.bank.application.repository.BankAccountRepository;


@Service
public class AccountServiceImpl implements AccountService{

	@Autowired
	BankAccountRepository accountrepo;
	@Override
	public void addBankAccount(BankAccount account) {
		accountrepo.save(account);	
	}

	@Override
	public List<BankAccount> viewAllAccounts() {
		return accountrepo.findAll();
	}

	@Override
	public Optional<BankAccount> getById(int accno) {
		Optional<BankAccount> account = accountrepo.findById(accno);
		
		return account;
	}

	@Override
	public void updateBankAccount(BankAccount account) {
		accountrepo.save(account);
		
	}

	@Override
	public void deleteBankAccount(int accountid) {
		accountrepo.deleteById(accountid);
		
	}
}
