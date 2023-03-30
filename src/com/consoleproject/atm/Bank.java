package com.consoleproject.atm;
import java.util.ArrayList;
public class Bank {
	
	
	private String bankName;
	private ArrayList<AccountHolder> accountHolders = new ArrayList<AccountHolder>();
	
	
	public Bank(String bankName) {
		this.bankName = bankName;
		AccountHolder accountHolder = createNewAccountHolder();
		accountHolders.add(accountHolder);
		
		
	}
	
	//Method to create New Account Holder
	AccountHolder createNewAccountHolder() {
		
		String accoutHolderName = "Vivek";
		String accountHolderID = "987654";
		Integer pin = 1234;
		
		AccountHolder accountHolder = new AccountHolder(accoutHolderName, accountHolderID, pin);
		
		return accountHolder;
	}
	
	public boolean authentication(String id, Integer pin) {
		if(id == )
	}

	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", accountHolders=" + accountHolders + "]";
	}
	
	

}
