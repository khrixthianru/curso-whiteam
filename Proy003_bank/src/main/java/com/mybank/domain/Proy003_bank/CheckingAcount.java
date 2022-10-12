package com.mybank.domain.Proy003_bank;

public class CheckingAcount extends Account {

	private double creditoPermitido;	
	

	public CheckingAcount(double balance, double creditoPermitido) {
		super(balance);
		this.creditoPermitido = this.creditoPermitido;
	}

	public CheckingAcount(double balance) {
		this(balance, 500.0);
	}
	
	@Override
	public boolean withdraw(double amt) {
		boolean resultado = true;
		if(this.balance < amt) {
			double credito = amt - this.balance;
			if(creditoPermitido < credito) {
				resultado = false;
				
			}else {
			balance -= amt;
			resultado =  true;
			}
		}
		return resultado;
	}
	
	
}
