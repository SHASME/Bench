package com.cg.bank.application.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "bankaccount")
public class BankAccount {
	@Id
	@SequenceGenerator(name = "account_seq",initialValue=1,sequenceName="account_code_seq",allocationSize=1)
	@GeneratedValue(generator="account_seq",strategy = GenerationType.SEQUENCE)
	private int accountid;
	@Column(name = "accountholdername",length = 25)
	private String accountholdername;
	@Column(name = "accountnumber",length = 25)
	private double accountnumber;
	@Column(name ="branch",length=25)
	private String branch;
	@Column(name="balance",length=25)
	private double balance;
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public String getAccountholdername() {
		return accountholdername;
	}
	public void setAccountholdername(String accountholdername) {
		this.accountholdername = accountholdername;
	}
	public double getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(double accountnumber) {
		this.accountnumber = accountnumber;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [accountid=" + accountid + ", accountholdername=" + accountholdername + ", accountnumber="
				+ accountnumber + ", branch=" + branch + ", balance=" + balance + "]";
	}
}
