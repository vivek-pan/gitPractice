package com.consoleproject.atm;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		
		//Creating New AccountHolder
		Bank bank = new Bank("FDHC");
		
		System.out.println(bank);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("*****-----Welcome-----*****");

		System.out.println("Enter Account Holder ID Number");
		String id = sc.next();

		System.out.println("Enter PIN");
		int pin = sc.nextInt();
		if(bank.authentication(id,pin)) {
			System.out.println("welcome");
		}
	
	}
}