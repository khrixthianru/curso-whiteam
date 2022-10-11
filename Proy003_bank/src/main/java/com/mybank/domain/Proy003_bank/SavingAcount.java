package com.mybank.domain.Proy003_bank;

public class SavingAcount extends Account {

	private double interestRate;

	public SavingAcount(double balance, double interestRate) {
		super(balance);
		this.interestRate = interestRate;
	}
	
	
	
}
