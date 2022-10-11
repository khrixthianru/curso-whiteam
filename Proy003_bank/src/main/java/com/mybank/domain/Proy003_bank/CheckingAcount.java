package com.mybank.domain.Proy003_bank;

public class CheckingAcount extends Account {

	private double creditoPermitido;

	public CheckingAcount(double balance, double creditoPermitido) {
		super(balance);
		this.creditoPermitido = creditoPermitido;
	}

	public CheckingAcount(double balance) {
		this(balance, 1000.0);
	}
	
	public boolean withdraw(double amt) {
		
		if(amt > this.getBalance() + this.creditoPermitido) {
			return false;
		}else {
			balance -= amt;
			return true;
		}
	}
	
	
}
