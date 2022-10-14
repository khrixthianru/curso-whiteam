package ej1_modulo8;


public class Account {

	protected double balance;

	protected Account(double balance) {
		this.balance = balance;
	}
	
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amt) {
		balance += amt;
		
	}
	
	public void withdraw(double amt) {	
		this.balance -= amt;
		
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
	
	
}
