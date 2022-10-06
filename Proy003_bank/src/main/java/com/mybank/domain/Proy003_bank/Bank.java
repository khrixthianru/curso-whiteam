package com.mybank.domain.Proy003_bank;

public class Bank {
	
	private static Customer[] clientes;
	private static int numClientes;
	
	//constructor	
	public Bank(Customer[] clientes) {
		super();
		this.clientes = new Customer[100];
	}
	
	public Bank() {
		super();
		this.clientes = new Customer[100];
	}
	
	//getter and setter
	public Customer[] getClientes() {
		return clientes;
	}
	
	public int getNumClientes() {
		return numClientes;
	}
	
	//metodos
	
	public static void anyadirCliente(String nombreCliente, String apellCliente) {
		Customer cliente = new Customer(nombreCliente, apellCliente);
		numClientes ++;
		if(clientes.length> numClientes) {
			clientes[numClientes-1] = cliente;
		}else {
			System.out.println("Ya no caben más clientes.");
		}
		
	}
	
	public String getCustomer(int x) {		
		 return clientes[x-1].toString();
	}
	
	public static void deleteCustomer(int x) {
		System.out.println("Ha eliminado al cliente " + clientes[x-1].getFirstName() + " " +
				clientes[x-1].getLastName() + ".");
		
		clientes[x-1] = null;
		numClientes --;
	}
	
	
}
