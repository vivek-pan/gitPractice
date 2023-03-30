package com.consoleproject.atm;
import java.util.ArrayList;
import java.util.Date;

public class Transaction {
	
	private Double amount;
	private Date timestamp = new Date();
	private String transactionType;
	
	public Transaction(Double amount, String transactionType) {
		this.amount = amount;
		this.transactionType = transactionType;
		this.timestamp = getTimestamp();
	}

	public Double getAmount() {
		return amount;
	}
	
	public Date getTimestamp() {
		return timestamp;
	}

	@Override
	public String toString() {
		return "Transaction [amount=" + amount + ", timestamp=" + timestamp + ", transactionType=" + transactionType
				+ "]";
	}
	
	
	
	

}
