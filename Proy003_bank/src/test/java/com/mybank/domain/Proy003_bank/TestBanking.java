package com.mybank.domain.Proy003_bank;

import java.util.Date;

public class TestBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer("Fernandez", "Romero");
		Account a1 = new Account(500);
		c1.anyadirCuenta(a1);
		a1.withdraw(150);
		System.out.println("saco 150 y me quedan " + a1.getBalance());
		a1.deposit(22.5);
		System.out.println("Ingreso 22,5 y tengo " + a1.getBalance());
		a1.withdraw(47.62);
		System.out.println("saco 47,62 y me quedan " + a1.getBalance());
		a1.withdraw(400);
		System.out.println("intento sacar 400 y no puedo por que me quedan " + a1.getBalance());

		
		
		
		//practica 5 bank
		
		Bank b = new Bank();
		b.anyadirCliente("Juan", "Castillo");
		b.anyadirCliente("Pedro", "Perez");
		b.anyadirCliente("Maria", "Juana");
		b.anyadirCliente("Raquel", "Ilich");
		
		pintarClientes(b);
		
		b.deleteCustomer(2);
		
		pintarClientes(b);
		
		//practika 6-2
		System.out.println("--------------------------------------------------------");
		Customer c5 = new Customer("Fernandez", "Romero");
		Account a5 = new Account(500);
		Account a51 = new Account(1000);
		c5.anyadirCuenta(a5);
		c5.anyadirCuenta(a51);
		c5.getAccount(1);
		c5.numeroDeCuentas();
		
			// pruebas customerReport de la practika 6-2
		
		Customer sj = new Customer("Simms", "Jane");
		SavingAcount sa = new SavingAcount(500.0, 3);
		CheckingAcount ca = new CheckingAcount(200.0);
		sj.anyadirCuenta(sa);
		sj.anyadirCuenta(ca);
		
		Customer bo = new Customer("Bryant", "Owen");
		CheckingAcount caBO = new CheckingAcount(500.0, 0.0);
		bo.anyadirCuenta(caBO);
		
		Customer st = new Customer("Soley", "Tim");
		SavingAcount saST = new SavingAcount(1500.0, 1);
		CheckingAcount caST = new CheckingAcount(500.0, 500.0);
		st.anyadirCuenta(saST);
		st.anyadirCuenta(caST);
		
		Customer sm = new Customer("Soley", "Maria");
		
		System.out.println("---------------------------------------------------------");
		
		testReport(sj);
		testReport(bo);
		testReport(st);
		testReport(sm);
		
		//practica 6.1  he modificado los datos de las cuentas de los de la practica 6.2
		System.out.println("jane smith");
		sa.withdraw(150.0);
		sa.deposit(22.5);
		sa.withdraw(47.62);
		sa.withdraw(400);
		System.out.println(sa.getBalance());
		System.out.println("-----------------------------------------");
		
		System.out.println("owen bryant");
		caBO.withdraw(150.0);
		caBO.deposit(22.5);
		caBO.withdraw(47.62);
		caBO.withdraw(400);
		System.out.println(caBO.getBalance());
		System.out.println("-----------------------------------------");
		
		System.out.println("tim soley");
		caST.withdraw(150.0);
		caST.deposit(22.5);
		caST.withdraw(47.62);
		caST.withdraw(400);
		System.out.println(caST.getBalance());
		System.out.println("-----------------------------------------");
		
		System.out.println("maria soley");
		caST.deposit(150.0);
		caST.withdraw(750.0);
		System.out.println(caST.getBalance());
		System.out.println("-----------------------------------------");
		
	}
	
	public static void testReport(Customer c) {
		
		int intNumCtas = c.getIntNumeroCuentas();	
		c.numeroDeCuentas();
		while(intNumCtas>0) {
			c.getAccount(intNumCtas);
			intNumCtas --;
		}
		System.out.println("-----------------------------------------------------------");
		
	}
	
	public static void pintarClientes(Bank b) {
		for(Customer c : b.getClientes()) {
			if (c != null) {
				System.out.println(c.toString());
			}
		}
		System.out.println("Hay " + b.getNumClientes() + " clientes en el banco.");
	}

}
