package com.mybank.domain.Proy003_bank;
//hola
public class TestBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer("Fernandez", "Romero");
		Account a1 = new Account(500);
		c1.setAccount(a1);
		a1.withdraw(150);
		System.out.println("saco 150 y me quedan " + a1.getBalance());
		a1.deposit(22.5);
		System.out.println("Ingreso 22,5 y tengo " + a1.getBalance());
		a1.withdraw(47.62);
		System.out.println("saco 47,62 y me quedan " + a1.getBalance());
		a1.withdraw(400);
		System.out.println("intento sacar 400 y no puedo por que me quedan " + a1.getBalance());

	}

}
