package com.mybank.domain.Proy003_bank;

public class CheckingAcount extends Account {

	private double creditoPermitido;	
	

	public CheckingAcount(double balance, double creditoPermitido) {
		super(balance);
		this.creditoPermitido = creditoPermitido;
	}

	public CheckingAcount(double balance) {
		this(balance, 0.0);
	}
	
	@Override
	public boolean withdraw(double amt) {
		boolean resultado = true;
		if(this.balance < amt) {
			double pideCredito = amt - this.balance;
			if(pideCredito > this.creditoPermitido) {
				resultado = false;
				
			}else {
				balance = 0.0;
				this.creditoPermitido -= pideCredito;						
				resultado =  true;
			}
		}else {
			balance -= amt;			
		}
		return resultado;
	}
	
	
}
