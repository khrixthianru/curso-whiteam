package com.mybank.domain.Proy003_bank;


public class Account {

	protected double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public boolean deposit(double amt) {
		balance += amt;
		return true;
		
	}
	
	public boolean withdraw(double amt) {		
		if(amt <= balance) {
			balance -= amt;
			return true;
		}

		return false;
		
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
	
	
}
