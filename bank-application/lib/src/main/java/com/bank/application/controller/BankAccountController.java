package com.bank.application.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.application.model.BankAccount;
import com.bank.application.services.AccountServiceImpl;


@RestController
@RequestMapping("/bank")
public class BankAccountController {
	@Autowired
	private AccountServiceImpl accountservice;
	
	@PostMapping
	public ResponseEntity<String>addBankAccount(@RequestBody BankAccount account){
		accountservice.addBankAccount(account);
		return new ResponseEntity<String>("inserted",HttpStatus.OK);
	
	}
	@GetMapping
	public ResponseEntity<List<BankAccount>> getAllAccounts(){
		List<BankAccount> accountList = accountservice.viewAllAccounts();
		return new ResponseEntity<List<BankAccount>>(accountList,HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<String> editAccount(@RequestBody BankAccount account){
		accountservice.updateBankAccount(account);
		return new ResponseEntity<String>("updated",HttpStatus.OK);
	}
	@DeleteMapping("/id")
	public ResponseEntity<String> deleteAccount(@PathVariable int accountid){
		accountservice.deleteBankAccount(accountid);
		return new ResponseEntity<String>("deleted",HttpStatus.OK);
	}

}
