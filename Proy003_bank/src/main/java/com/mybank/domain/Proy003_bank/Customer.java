package com.mybank.domain.Proy003_bank;

public class Customer {

	private String firstName;
	private String lastName;
	private Account[] cuentas;
	private int intNumeroCuentas;
	
	public Customer(String firstName, String lastName, Account[] cuentas) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.cuentas = cuentas;
	}
	
	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.cuentas = new Account[10];
	}
	
	public int getIntNumeroCuentas() {
		return intNumeroCuentas;
	}
	
	public Account[] getArray() {
		return cuentas;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	//metodos
	public void anyadirCuenta(Account cuenta) {
		this.intNumeroCuentas ++;
		this.cuentas[this.intNumeroCuentas] = cuenta;
	}
	
	public void getAccount(int x) {
		System.out.println("Cliente: \n"
				+ firstName + " " + lastName + "\n"
				+ "Cuenta: \n"
				+ this.cuentas[x]);
	}
	
	public void numeroDeCuentas() {
		System.out.println("El cliente: \n"
				+ firstName + " " + lastName + "\n"
				+ "tiene " + this.intNumeroCuentas + " cuentas.");
	}
	
	
}
