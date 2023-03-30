package com.consoleproject.atm;
import java.util.ArrayList;

public class Account {
	
	private String accountType;
	private Integer accountNumber;
	private Double accountBalance;
	private ArrayList<Transaction> transactions = new ArrayList<Transaction>();
	
	
	public Account(String accountType, Integer accountNumber) {
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.accountBalance = calculateAccountBalance();
	}
//		Transaction trans = new Transaction(100.00, "Credit");
//		transactions.add(trans);
	
	private Double calculateAccountBalance() {
		double sum = 0;
		for (Transaction tran : transactions) {
			sum = sum + tran.getAmount();
			
		}
		return sum;
	}
	
	




	@Override
	public String toString() {
		return "Account [accountType=" + accountType + ", accountNumber=" + accountNumber + ", accountBalance="
				+ accountBalance + ", transactions=" + transactions + "]";
	}




	
}



