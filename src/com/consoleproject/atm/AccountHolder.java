package com.consoleproject.atm;
import java.util.ArrayList;

public class AccountHolder {
	
	private String accoutHolderName;
	private String accountHolderID;
	private ArrayList<Account> accounts = new ArrayList<Account>();
	private Integer pin;
	
	
	//constructor
	public AccountHolder(String accoutHolderName, String accountHolderID,Integer pin) {
		this.accoutHolderName = accoutHolderName;
		this.accountHolderID = accountHolderID;
		this.pin = pin;
		
		
		Account account1 = new Account("Savings Account",1111);
		Account account2 = new Account("Current Account",2222);
		
		this.accounts.add(account1);
		this.accounts.add(account2);
	}


	@Override
	public String toString() {
		return "AccountHolder [accoutHolderName=" + accoutHolderName + ", accountHolderID=" + accountHolderID
				+ ", accounts=" + accounts + ", pin=" + pin + "]";
	}
}
