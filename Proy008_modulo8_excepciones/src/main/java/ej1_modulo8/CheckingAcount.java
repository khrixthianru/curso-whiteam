package ej1_modulo8;

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
	public void withdraw(double amt) {
		if(this.balance < amt) {
			double pideCredito = amt - this.balance;
			if(pideCredito > this.creditoPermitido) {
				
			}else {
				balance = 0.0;
				this.creditoPermitido -= pideCredito;	
			}
		}else {
			balance -= amt;			
		}
	}
}
